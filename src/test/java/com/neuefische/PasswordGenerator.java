package com.neuefische;


public class PasswordGenerator {

    public static void main(String[] args) {
        generateSecurePassword(16);
    }

    // create function to generate random index number (so we can use String.charAt() method
    public static char getRandomChar(String input) {
        int randomIndex = (int) (Math.random() * input.length());
        return input.charAt(randomIndex);
    }


    public static String generateSecurePassword(int desiredPasswordLength) {

        String upperCase = "ABCDEFGHILKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";
        String specialChar = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~\\";

        String securePassword = "";

        while (securePassword.length() < desiredPasswordLength) {
            securePassword += getRandomChar(upperCase);
            if (securePassword.length() < desiredPasswordLength) {
                securePassword += getRandomChar(lowerCase);
            }
            if (securePassword.length() < desiredPasswordLength) {
              securePassword += getRandomChar(digit);
            }
            if (securePassword.length() < desiredPasswordLength) {
                securePassword += getRandomChar(specialChar);
            }
        }
        System.out.println("Final SecurePassword: " + securePassword);
        System.out.println("Final SecurePassword length is: " + securePassword.length());

        return securePassword;
    }


}
