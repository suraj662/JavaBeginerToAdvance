package com.example.ratelimitapp.filter;


import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class RateLimitFilter extends OncePerRequestFilter {

    // store buckets per IP
    private final Map<String, Bucket> cache = new ConcurrentHashMap<>();

    private Bucket createNewBucket() {

        Bandwidth limit = Bandwidth.builder()
                .capacity(5) // max 5 requests
                .refillGreedy(5, Duration.ofMinutes(1))
                .build();

        return Bucket.builder()
                .addLimit(limit)
                .build();
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        // client IP
        String ip = request.getRemoteAddr();

        // get/create bucket
        Bucket bucket = cache.computeIfAbsent(ip, k -> createNewBucket());

        // consume token
        if (bucket.tryConsume(1)) {

            filterChain.doFilter(request, response);

        } else {

            response.setStatus(429);

            response.getWriter()
                    .write("Too many requests. Try again later.");
        }
    }
}