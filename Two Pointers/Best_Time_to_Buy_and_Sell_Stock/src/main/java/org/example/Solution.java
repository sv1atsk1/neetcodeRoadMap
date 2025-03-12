package org.example;

// Временная сложность: O(n), где n — длина массива prices, так как мы проходим по массиву всего один раз.
//Пространственная сложность: O(1), поскольку мы используем только фиксированное количество переменных для хранения указателей и результата.
public class Solution {
    public int maxProfit(int[] prices) {

        int left = 0, right = 1;
        int result = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                result = Math.max(result, profit);
            }
            else{
                left = right;
            }
            right++;
        }
        return result;
    }
}