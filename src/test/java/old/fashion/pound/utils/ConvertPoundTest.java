package old.fashion.pound.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertPoundTest {

    @Test
    void testToPennies() {
        assertEquals(1412, ConvertPound.toPennies("5p 17s 8d"));
        assertEquals(1514, ConvertPound.toPennies("6p 6s 2d"));
    }

    @Test
    void testToPoundString() {
        assertEquals("5p 17s 8d", ConvertPound.toPoundString(1412));
        assertEquals("6p 6s 2d", ConvertPound.toPoundString(1514));
    }

    @Test
    void testToRemainingsString() {
        assertEquals(" (2d)", ConvertPound.toRemainingsString(2));
        assertEquals(" (1s 1d)", ConvertPound.toRemainingsString(13));
    }
}