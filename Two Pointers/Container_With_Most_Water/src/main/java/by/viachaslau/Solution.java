package by.viachaslau;

//Временная сложность: O(n), где n — количество элементов в массиве heights.
//Пространственная сложность: O(1), так как используется только фиксированное количество переменных.
public class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int result = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            result = Math.max(result, width * height);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
