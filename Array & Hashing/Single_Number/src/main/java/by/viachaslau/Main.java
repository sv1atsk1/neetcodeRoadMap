package by.viachaslau;

// Time Complexity: O(n), where n is the number of elements in the array, since we traverse the array once
// Space Complexity: O(1), as we use only a fixed amount of extra space (the variable single).
public class Main {

    public static int singleNumber(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num;
        }

        return single;
    }
}