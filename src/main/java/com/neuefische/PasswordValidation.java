package com.neuefische;

public class PasswordValidation {
    public static boolean isPasswordLengthValid(String password) {
        int minLength = 8;
        int maxLength = 36;

            if (password == null ||
                password.isEmpty() ||
                password.length() < minLength ||
                password.length() > maxLength) {
            return false;
        }
        return true;
    }

    public static boolean checkPasswordContainsNumber(String password) {
        // You can use String.isEmpty() method instead of password.length == 0
        if (password == null || password.isEmpty()) {
            return false;
        }
        // convert String to chars array
        char[] charArray = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            // IMPORTANT: You cannot just use: charArray[i].isDigit()
            // You need to use the built-in Character method: Character.isDigit()
            if (Character.isDigit(charArray[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsUpperCaseChars(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        // convert String to chars array
        char[] charArray = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            // You need to use the built-in Character method: Character.isDigit()
            if (Character.isUpperCase(charArray[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsLowerCaseChars(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        // convert String to chars array
        char[] charArray = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            // You need to use the built-in Character method: Character.isDigit()
            if (Character.isLowerCase(charArray[i])) {
                return true;
            }
        }
        return false;
    }
}
