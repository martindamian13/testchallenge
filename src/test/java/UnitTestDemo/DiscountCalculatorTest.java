package UnitTestDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import UnitTestDemo.DiscountCalculator.MembershipLevel;

class DiscountCalculatorTest {
    DiscountCalculator calculator = new DiscountCalculator();

    @Test()
    void testCaseOne() {
        double want = 100.0;
        double got = calculator.calculateFinalPrice(100.0, MembershipLevel.NONE);
        assertEquals(want, got);
    }

    @Test()
    void testCaseThree() {
        double want = 100.0;
        double got = calculator.calculateFinalPrice(100.0, MembershipLevel.SILVER);
        assertEquals(want, got);
    }

    @Test()
    void testCaseFour() {
        double want = 95.94999999999999;
        double got = calculator.calculateFinalPrice(101.0, MembershipLevel.SILVER);
        assertEquals(want, got);
    }
}