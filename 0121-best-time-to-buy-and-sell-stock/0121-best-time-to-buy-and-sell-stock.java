class Solution {
   public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a very large value
    int maxProfit = 0; // Initialize maxProfit to 0

    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]; // Update minPrice if a lower price is encountered
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice; // Update maxProfit if a higher profit is obtained
        }
    }

    return maxProfit;
}


}