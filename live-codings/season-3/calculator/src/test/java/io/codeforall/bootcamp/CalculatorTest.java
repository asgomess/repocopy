package io.codeforall.bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sumTwoPositiveIntegersReturnsCorrectResult() {
        int result = calculator.sum(10,5);
        int expected = 15;

        assertEquals(expected, result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumFirstArgumentNegativeIntegerThrowsException() {
        calculator.sum(-10,5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumSecondArgumentNegativeIntegerThrowsException() {
        calculator.sum(10,-5);
    }
}
