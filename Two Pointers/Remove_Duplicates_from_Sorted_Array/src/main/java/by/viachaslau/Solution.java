package by.viachaslau;

//Time Complexity: O(N)
//Space Complexity: O(1)
public class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int left = 1;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}