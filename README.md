# Sesion 6: Testing challenge

In this exercise we implemented a DiscountCalculator class that calculates the 
final price after applying a discount based on the original price and the customer's 
membership type. The discount varies depending on the membership level, 
with some levels offering no discount and others providing discounts based on the 
purchase amount.

# Team Members
- Martin Quintana
- Agustin Arce
- Romina Caballero

# Summary of the exercise
Implement a DiscountCalculator class that calculates the final price after applying a discount based on the original price and the customer's membership type. The discount varies depending on:
- Non-members: No discount.
- Silver members: 5% discount for purchases over $100.
- Gold members: 10% discount for purchases over $50.
- Platinum members: 20% discount, regardless of the purchase amount

# Testing Technique Used
For this exercise we agreed to use 2-value Boundary Value Analysis in order to test
all our limits are working as expected. Our table looks like this:

| TEST CASE | MEMBERSHIP    | DISCOUNT | PRICE TO TEST | PRICE EXPECTED | DISCOUNT? |
|-----------|---------------|----------|---------------|----------------|-----------|
| TC01      | No membership | 0%       | 100           | 100            | NO        |
| TC02      | No membership | 0%       | random()      | same random()  | NO        |
| TC03      | Silver        | 5%       | 100           | 100            | NO        |
| TC04      | Silver        | 5%       | 101           | 95.95          | YES       |
| TC05      | Gold          | 10%      | 50            | 50             | NO        |
| TC06      | Gold          | 10%      | 51            | 45.90          | YES       |
| TC07      | Platinum      | 20%      | 100           | 80             | YES       |
| TC08      | Platinum      | 20%      | 200           | 160            | YES       |

### Why using this testing technique?
With BVA we effectively identify potential issues at the boundaries of the input ranges. Since the
discount calculations depend on specific prices, testing values around those limits
can reveal edge cases that might not be handled correctly.