package com.demo.ss8_btth.custom_validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Scanner;

public class MedCodeValidator implements ConstraintValidator<MedCode, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true;
        }
        return value.startsWith("MED_");
    }
}
