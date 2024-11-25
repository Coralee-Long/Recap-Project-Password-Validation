package com.neuefische;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PasswordValidationTest {

    // Sad case
    @Test
    void expectFalse_whenPW_length_lessThan_8chars() {
        // GIVEN
        String password = "short";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    // Happy Case
    @Test
    void expectTrue_whenPW_length_min_8chars() {
    // GIVEN
        String password = "morethaneight123";
    // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
    // THEN
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    // possible edge case - password exactly 8 chars in length
    @Test
    void expectTrue_whenPW_length_exactly_8chars() {
        // GIVEN
        String password = "12345678";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    // possible edge case - password empty String
    @Test
    void expectFalse_whenPW_emptyString() {
        // GIVEN
        String password = "";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    // possible edge case - password empty String
    @Test
    void expectFalse_whenPW_null() {
        // GIVEN
        String password = null;
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    // possible edge case - password is crazy long
    @Test
    void expectFalse_whenPW_lengthExceeds_max36Chars() {
        // GIVEN
        String password = "thisIsSomeCrazyLongPasswordThatIsDefinitelyTooLong1234567890";
        // WHEN
        boolean actual = PasswordValidation.isPasswordLengthValid(password);
        // THEN
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}