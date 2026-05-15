package com.example.webapp.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class PasswordValidator  implements ConstraintValidator<ValidPassword , String> {

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {

        if (password == null) return false;

        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean minLength = password.length() >= 8;

        return hasUppercase && hasNumber && minLength;
    }
}
