package com.neuefische;

public class PasswordValidation {
    public static boolean isPasswordLengthValid(String password) {
        int minLength = 8;
        int maxLength = 36;

        if (password == null || password.length() < minLength || password.length() > maxLength) {
            return false;
        }
        return true;
    }
}
