package DynamicProgramming.BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        // Test case 1: Regular case
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices1));

        // Test case 2: No profit can be made
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices2));

        // Test case 3: Empty input
        int[] prices3 = {};
        assertEquals(0, solution.maxProfit(prices3));

        // Test case 4: Single element
        int[] prices4 = {5};
        assertEquals(0, solution.maxProfit(prices4));

        // Test case 5: Multiple buy-sell opportunities
        int[] prices5 = {3, 2, 6, 5, 0, 3};
        assertEquals(4, solution.maxProfit(prices5));

        // Test case 6: All prices the same
        int[] prices6 = {3, 3, 3, 3, 3};
        assertEquals(0, solution.maxProfit(prices6));
    }
}
