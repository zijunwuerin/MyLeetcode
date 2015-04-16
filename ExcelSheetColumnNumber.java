public class Solution {
    public int titleToNumber(String s) {
       int result = 0;
       int base = 1;
       int len = s.length();
       for (int i = (len - 1); i >= 0; i--) {
           result = result + (s.charAt(i) - 'A' + 1) * base;
           base = base * 26;
       }
    return result;    
    }
}