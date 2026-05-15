package com.example.webapp.controller;

import com.example.webapp.dto.auth.LoginRequest;
import com.example.webapp.dto.auth.LoginResponse;
import com.example.webapp.dto.auth.RegisterRequest;
import com.example.webapp.service.AuthService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // REGISTER
    //POST http://localhost:8080/auth/register
    //ex - {
    //  "name": "Pawan",
    //  "email": "pawan@gmail.com",
    //  "password": "Abcd1234"
    //}
    @PostMapping("/register")
    public String register(
            @Valid @RequestBody RegisterRequest request
    ) {
        return authService.register(request);
    }

    //or
//    @PostMapping("/register")
//    public ApiResponse<UserDTO> register(@RequestBody RegisterRequest request) {
//
//        UserDTO user = authService.register(request);
//
//        return ApiResponse.success(user, "User registered successfully");
//    }

    // LOGIN
    //POST http://localhost:8080/auth/login
    //ex - {
    //  "email": "pawan@gmail.com",
    //  "password": "Abcd1234"
    //}
    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody LoginRequest request
    ) {
        return authService.login(request);
    }



    @GetMapping("/me")
    public String me(Authentication authentication) {

        return authentication.getName();
    }
}