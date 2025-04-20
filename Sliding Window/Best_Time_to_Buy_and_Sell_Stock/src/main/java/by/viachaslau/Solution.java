package by.viachaslau;

//Space Complexity - 0(1);
//Time Complexity - O(N);

public class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;
        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            }
            else{
                left = right;
            }
        }
        return maxProfit;
    }
}