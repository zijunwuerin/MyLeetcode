public class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        if (k > length) {
            k = k % length;
        }
        if (k < 0) {
            k = k % length +length;
        }
        for (int i = 0; i < length; i++) {
            temp[(i+k) % length] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, temp.length);
    }
}