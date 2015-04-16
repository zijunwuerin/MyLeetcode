public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        int i = 0;
        while (i < 32) {
            i = i + 1;
            ret = ret << 1;
            ret = ret | n & 1;
            n = n >> 1;
         
        }    
        
        return ret;
    }
}