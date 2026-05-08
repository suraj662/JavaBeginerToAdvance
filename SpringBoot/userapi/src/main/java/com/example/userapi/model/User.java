package com.example.userapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "userdata")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required") // ✅ validation
    private String name;

    @Email(message = "Invalid email format") // ✅ validation
    @NotBlank(message = "Email is required") // ✅ validation
    private String email;

    @Size(min = 3, message = "Password must be at least 4 characters")
    private String password;

    public User() {}

    //Getter & Setter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
