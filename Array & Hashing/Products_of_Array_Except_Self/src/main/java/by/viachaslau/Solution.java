package by.viachaslau;

//Временная сложность: O(n), где n — длина массива. Мы проходим по массиву дважды.
//Пространственная сложность: O(1) (без учета выходного массива). Мы используем только несколько переменных для хранения промежуточных результатов.
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}