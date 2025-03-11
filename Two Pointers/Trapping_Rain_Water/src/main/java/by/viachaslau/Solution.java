package by.viachaslau;

//Поскольку мы проходим по массиву один раз и выполняем фиксированное количество операций на каждой итерации, общая временная сложность составляет O(n).
//Пространственная сложность алгоритма составляет O(1), поскольку мы используем только фиксированное количество дополнительных переменных (left, right, leftMax, rightMax, и result), вне зависимости от размера входного массива.
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int result = 0;
        while(left < right){
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax,height[left]);
                result += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax,height[right]);
                result += rightMax - height[right];
            }
        }
        return result;
    }
}