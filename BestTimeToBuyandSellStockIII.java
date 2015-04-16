public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        //forward
        int[] todayProfit = new int[prices.length]; 
        for (int buyday = 0, today = 1; today < (prices.length); ++today) {
            int dif = prices[today] - prices[buyday];
            if (dif <= 0) {
                buyday = today;
            }   else {
                todayProfit[today] = Math.max(dif, todayProfit[today - 1]);
            }
        }
        //backward
        int backward = 0;
        int profit = todayProfit[prices.length - 1];         ;
        for (int sellday = (prices.length - 1), today = (prices.length - 2); today > 0; --today) {
            int diff = prices[sellday] - prices[today];
            if (diff <= 0) {
                sellday = today;
            }   else {
                backward = Math.max(diff, backward);
            }
            profit = Math.max(profit,(todayProfit[today] + backward));
        }
       return profit; 
    }
}