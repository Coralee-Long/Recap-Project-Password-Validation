package com.neuefische;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PasswordValidationTest {

    // ---------------------- Password Length Validations ----------------------- //

    // Sad case - Check password length
    @Test
    void expectFalse_whenPW_length_lessThan_8chars() {
        // GIVEN
        String password = "short";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Happy Case - Check password length
    @Test
    void expectTrue_whenPW_length_min_8chars() {
    // GIVEN
        String password = "morethaneight123";
    // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
    // THEN
        Assertions.assertTrue(actual);
    }

    // Edge Case - password exactly 8 chars in length
    @Test
    void expectTrue_whenPW_length_exactly_8chars() {
        // GIVEN
        String password = "12345678";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    // Edge Case - password empty String
    @Test
    void expectFalse_whenPW_length_isEmpty() {
        // GIVEN
        String password = "";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Edge Case - password empty String
    @Test
    void expectFalse_whenPW_length_null() {
        // GIVEN
        String password = null;
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Edge Case - password is crazy long
    @Test
    void expectFalse_whenPW_length_exceeds_max36Chars() {
        // GIVEN
        String password = "thisIsSomeCrazyLongPasswordThatIsDefinitelyTooLong1234567890";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // ---------------------- Password Contains Number Validations ----------------------- //

    // Sad case - Check if password contains any numbers
    @Test
    void expectFalse_whenPW_containsNoNumbers() {
        // GIVEN
        String password = "passwordWithNoNumbers";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsNumber(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Happy case - Check if password contains any numbers
    @Test
    void expectTrue_whenPW_containsNumbers() {
        // GIVEN
        String password = "passwordWithNumbers123";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsNumber(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    // Edge case - Check if password is null
    @Test
    void expectFalse_whenPW_isNull() {
        // GIVEN
        String password = null;
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsNumber(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Edge case - Check if password is null
    @Test
    void expectFalse_whenPW_isEmpty() {
        // GIVEN
        String password = "";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsNumber(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // ---------------------- Password Upper/Lower Case Validations ----------------------- //

    // Sad case - if password has no UpperCase char(s)
    @Test
    void expectFalse_whenPW_containsNoUpperCaseChars() {
        // GIVEN
        String password = "ihavenouppercasechars123";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsUpperCaseChars(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Happy Case - if password has UpperCase char(s)
    @Test
    void expectTrue_whenPW_containsUpperCaseChars() {
        // GIVEN
        String password = "iHaveUpperCaseChars123";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsUpperCaseChars(password);
        // THEN
        Assertions.assertTrue(actual);
    }

    // Sad case - if password has no LowerCase char(s)
    @Test
    void expectFalse_whenPW_containsNoLowerCaseChars() {
        // GIVEN
        String password = "IHAVENOLOWERCASECHARS123";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsLowerCaseChars(password);
        // THEN
        Assertions.assertFalse(actual);
    }

    // Happy Case - if password has LowerCase char(s)
    @Test
    void expectTrue_whenPW_containsLowerCaseChars() {
        // GIVEN
        String password = "iHaveLowerCaseChars123";
        // WHEN
        boolean actual = PasswordValidation.checkPasswordContainsLowerCaseChars(password);
        // THEN
        Assertions.assertTrue(actual);
    }
}