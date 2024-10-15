package UnitTestDemo;

/*
Practical task:
Implement a DiscountCalculator class that calculates the final price after applying a discount based on the original price and the customer's membership type.
The discount varies depending on:
Non-members: No discount.
Silver members: 5% discount for purchases over $100.
Gold members: 10% discount for purchases over $50.
Platinum members: 20% discount, regardless of the purchase amount
*/

public class DiscountCalculator {
    public enum MembershipLevel {
        NONE, SILVER, GOLD, PLATINUM
    }

    public double calculateFinalPrice(double originalPrice, MembershipLevel membership) {
        if (membership == MembershipLevel.NONE) {
            return originalPrice;
        }
        else if (membership == MembershipLevel.SILVER && originalPrice > 100) {
            return originalPrice * 0.95; // 5% discount
        }
        else if (membership == MembershipLevel.GOLD && originalPrice > 50) {
            return originalPrice * 0.90; // 10% discount
        }
        else if (membership == MembershipLevel.PLATINUM) {
            return originalPrice * 0.80; // 20% discount
        } else {
            return originalPrice; // No discount for smaller amounts
        }
    }
}