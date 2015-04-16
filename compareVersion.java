public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int length = Math.max(a.length, b.length);
        int a1, b1;
        for (int i = 0; i < length; i++) {
            
            if (i < a.length) {
                 a1 = Integer.parseInt(a[i]);
            } else {
                 a1 = 0;
            }
            if (i < b.length) {
                 b1 = Integer.parseInt(b[i]);
            } else {
                 b1 = 0;
            }   
            if(a1 > b1)
            return 1;
            if(a1 < b1)
            return -1;
                  
        }
        return 0;
    }
}