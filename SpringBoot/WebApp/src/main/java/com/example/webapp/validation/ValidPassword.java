package com.example.webapp.validation;

import java.lang.annotation.*;

import jakarta.security.auth.message.callback.PasswordValidationCallback;
import jakarta.servlet.annotation.HttpConstraint;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import javax.lang.model.element.Element;


@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {

    String message() default "Password must be at least 8 characters, include 1 uppercase letter and 1 number";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
