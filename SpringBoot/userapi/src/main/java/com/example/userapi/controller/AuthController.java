package com.example.userapi.controller;

import com.example.userapi.dto.*;
import com.example.userapi.service.AuthService;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.annotation.AuthenticationPrincipal;


@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        String token = authService.login(request.getUsername(), request.getPassword());
        return new LoginResponse(token);
    }


    //1 - Use Authentication in controller
    @GetMapping("/me")
    public String getLoggedInUser(Authentication authentication) {
        return authentication.getName(); // 👉 returns email
    }

    //2 — Use SecurityContextHolder (manual way)
    @GetMapping("/me2")
    public String getUser() {
        return SecurityContextHolder.getContext()
                .getAuthentication()
                .getName();
    }

    //3 — Use @AuthenticationPrincipal (cleanest)
    @GetMapping("/me3")
    public String getUser(@AuthenticationPrincipal Object user) {
        return user.toString();
    }

    //to give logged-in username
    @GetMapping("/profile")
    public String profile(Authentication auth) {
        String email = auth.getName();

        return "Welcome   " + email;
    }
}