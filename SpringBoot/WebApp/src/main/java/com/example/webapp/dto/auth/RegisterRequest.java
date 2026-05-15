package com.example.webapp.dto.auth;

import com.example.webapp.validation.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank
    private String name;

    @Email
    private String email;

    @ValidPassword
    private String password;
}