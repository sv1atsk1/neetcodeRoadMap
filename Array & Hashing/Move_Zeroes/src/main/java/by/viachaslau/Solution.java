package by.viachaslau;

// Time Complexity: 0(n), n - array length;
// Space Complexity: 0(1);
public class Solution {
    public static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}