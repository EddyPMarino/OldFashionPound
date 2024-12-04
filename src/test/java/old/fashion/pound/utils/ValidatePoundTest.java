package old.fashion.pound.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatePoundTest {

    @Test
    void testValidatePound() {
        assertTrue(ValidatePound.isValid("5p 17s 8d"));
        assertTrue(ValidatePound.isValid("12p 6s 10d"));
        assertTrue(ValidatePound.isValid("5p 17s"));
        assertFalse(ValidatePound.isValid("5p 17s 8"));
    }
}