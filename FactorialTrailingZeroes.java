public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n/i >= 1; n /= 5) {
            count = count + n/i;
            
        }
        return count;
        
    }
}