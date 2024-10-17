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

    @Test()
    void testCaseFive() {
        double want = 50;
        double got = calculator.calculateFinalPrice(50, MembershipLevel.GOLD);
        assertEquals(want, got);
    }

    @Test()
    void testCaseSix() {
        double want = 45.90;
        double got = calculator.calculateFinalPrice(51, MembershipLevel.GOLD);
        assertEquals(want, got);
    }

    @Test()
    void testCaseNine(){
        double want = 80;
        double got = calculator.calculateFinalPrice(100, MembershipLevel.PLATINUM);
        assertEquals(want,got);
    }

    @Test()
    void testCaseTen(){
        double want = 160;
        double got = calculator.calculateFinalPrice(200, MembershipLevel.PLATINUM);
        assertEquals(want,got);
    }

    @Test()
    void testCaseEleven(){
        double want = 1600;
        double got = calculator.calculateFinalPrice(2000, MembershipLevel.PLATINUM);
        assertEquals(want,got);
    }
}