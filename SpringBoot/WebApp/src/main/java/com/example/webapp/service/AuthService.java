package com.example.webapp.service;

import com.example.webapp.dto.auth.LoginRequest;
import com.example.webapp.dto.auth.LoginResponse;
import com.example.webapp.dto.auth.RegisterRequest;
import com.example.webapp.model.Role;
import com.example.webapp.model.User;
import com.example.webapp.repository.UserRepository;
import com.example.webapp.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtUtil jwtUtil
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    // REGISTER
//    public String register(RegisterRequest request) {
//
//        User user = new User();
//        user.setName(request.getName());
//        user.setEmail(request.getEmail());
//
//        // encrypt password
//        user.setPassword(
//                passwordEncoder.encode(request.getPassword())
//        );
//        if (userRepository.existsByEmail(request.getEmail())) {
//            throw new RuntimeException("Email already registered");
//        }
//
//        userRepository.save(user);
//
//        return "User registered successfully";
//    }

    public String register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        User user = new User();

        user.setName(request.getName());

        user.setEmail(request.getEmail());

        // encrypt password
        user.setPassword(
                passwordEncoder.encode(request.getPassword())
        );

        // ✅ default role
        //for user acess
        user.setRole(Role.USER);
        //for admin acess
        //user.setRole(Role.ADMIN);

        userRepository.save(user);

        return "User registered successfully";
    }

    // LOGIN
    public LoginResponse login(LoginRequest request) {

        User user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new RuntimeException("Invalid email"));

        // check password
        boolean valid = passwordEncoder.matches(
                request.getPassword(),
                user.getPassword()
        );

        if (!valid) {
            throw new RuntimeException("Invalid password");
        }

        // generate JWT
        String token =
                jwtUtil.generateToken(
                        user.getEmail(),
                        user.getRole().name()
                );

        return new LoginResponse(token);
    }
}