package by.viachaslau;

// Time Complexity: O(n)
// Space Complexity: O(1) (or O(n) if we need to create a new array).
public class Solution {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] resultArray = new int[digits.length + 1];
        resultArray[0] = 1;
        return resultArray;
    }
}