public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int dif = 0;
        if (prices.length == 0) {
            return 0;
        } else if (prices.length == 1) {
            return 0;
        } else {
            
            for (int i = 1; i < prices.length; i++) {
                if (prices[i - 1] < prices[i]) {
                    dif = prices[i] - prices[i - 1];
                    profit = profit + dif;
                }
             }
         }    
     return profit;   
    }
}