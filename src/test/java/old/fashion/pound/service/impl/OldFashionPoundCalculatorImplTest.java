package old.fashion.pound.service.impl;

import old.fashion.pound.service.OldFashionPoundCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OldFashionPoundCalculatorImplTest {

    private OldFashionPoundCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new OldFashionPoundCalculatorImpl();
    }

    @Test
    void testAdd() {
        assertEquals("9p 2s 6d", calculator.add("5p 17s 8d", "3p 4s 10d"));
    }

    @Test
    void testSubtract() {
        assertEquals("2p 12s 10d", calculator.subtract("5p 17s 8d", "3p 4s 10d"));
    }

    @Test
    void testMultiply() {
        assertEquals("11p 15s 4d", calculator.multiply("5p 17s 8d", 2));
    }

    @Test
    void testDivide() {
        assertEquals("1p 19s 2d (2d)", calculator.divide("5p 17s 8d", 3));
        assertEquals("1p 5s 0d (1s 1d)", calculator.divide("18p 16s 1d", 15));
    }
}