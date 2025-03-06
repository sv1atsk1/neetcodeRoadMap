package by.viachaslau;

import java.util.HashMap;

//Временная сложность: O(n), где n — длина массива nums, так как мы проходим массив один раз.
//Пространственная сложность: O(n) в худшем случае для хранения элементов в HashMap.
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int difference = target - nums[i];

            if(hashMap.containsKey(difference)){
                return new int[] { hashMap.get(difference), i };
            }

            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}