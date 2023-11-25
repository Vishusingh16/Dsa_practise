package Array;

public class Stocks {
    public static int bestTimeToBuyAndSellStock(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // If there are fewer than two prices, you cannot make a profit.
        }

        int minPrice = prices[0]; // Initialize the minimum price to the first element.
        int maxProfit = 0; // Initialize the maximum profit.

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if the current price is lower.
            minPrice = Math.min(minPrice, prices[i]);

            // Update the maximum profit if selling at the current price would yield a
            // higher profit.
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int result = bestTimeToBuyAndSellStock(prices);
        System.out.println("Maximum profit: " + result);
    }
}
