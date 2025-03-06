package by.viachaslau;

// Time Complexity: O(n), where n is the number of elements in the input array, since we are scanning the array only once.
//Space Complexity: O(1), since we are using a constant amount of space regardless of the input size.
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int midSum = numbers[left] + numbers[right];
            if (midSum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (midSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}