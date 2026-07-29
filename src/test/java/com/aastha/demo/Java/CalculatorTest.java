package com.aastha.demo.Java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int res = calculator.add(5, 3);
        assertEquals(8, res);
    }

    @Test
    void testSub() {
        int res = calculator.sub(5, 3);
        assertEquals(2, res);
    }

    @Test
    void testMul() {
        int res = calculator.mul(5, 3);
        assertEquals(15, res);
    }

    @Test
    void testDiv() {
        int res = calculator.div(6, 3);
        assertEquals(2, res);
    }

    @Test
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.div(5, 0);
        });
    }

    @Test
    void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }
}