package com.neuefische;

import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    // ----------- Attempt with Static list of passwords & HashSet
    // create a "static field" to store the passwords:
    private static HashSet<String> commonPasswords = new HashSet<>();

    // Basic loading of passwords from the file:
    public static void loadCommonPasswords() {
        try {
            InputStream inputStream = PasswordValidation.class.getResourceAsStream("/documents/10k-most-common.txt");

            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNextLine()) {
                commonPasswords.add(scanner.nextLine().trim());
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: Could not load common passwords.");
        }
    };

    // Check if password is common:
    public static boolean isPasswordCommon(String password) {
        if (commonPasswords == null || commonPasswords.isEmpty()) {
            loadCommonPasswords(); // Load passwords if not already loaded
        }
        return commonPasswords.contains(password);
    }

    // Bonus: Check if password contains special characters:
    public static boolean hasSpecialCharacters(String password) {
        Pattern regex = Pattern.compile("[^a-zA-Z0-9]"); // Kind of like saying: regex = !letters && !numbers

        if (regex.matcher(password).find()) {
            return true; // hasSpecialCharacters ? true
        }
        return false; // hasSpecialCharacters ? false
    }
}
