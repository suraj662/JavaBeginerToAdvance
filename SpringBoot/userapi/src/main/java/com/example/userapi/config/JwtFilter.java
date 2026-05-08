package com.example.userapi.config;

import com.example.userapi.security.JwtUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collections;

@Component
public class JwtFilter implements Filter {

    private final JwtUtil jwtUtil;

    public JwtFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        String path = req.getRequestURI();

        // ✅ Skip login endpoint
        if (path.equals("/auth/login")) {
            chain.doFilter(request, response);
            return;
        }

        String header = req.getHeader("Authorization");

        // ✅ NEW: handle missing or invalid header early
        if (header == null || !header.startsWith("Bearer ")) {
            chain.doFilter(request, response); // let Spring Security return 401
            return;
        }

        // ✅ Extract token
        String token = header.substring(7);

        // ✅ Validate token
        if (jwtUtil.validateToken(token)) {

            String email = jwtUtil.extractUsername(token);

            UsernamePasswordAuthenticationToken auth =
                    new UsernamePasswordAuthenticationToken(
                            email,
                            null,
                            Collections.emptyList()
                    );

            SecurityContextHolder.getContext().setAuthentication(auth);
        }

        chain.doFilter(request, response);
    }
}