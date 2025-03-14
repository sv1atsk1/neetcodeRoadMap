package by.viachaslau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Time Complexity: O(m + n), where m and n are the lengths of the two arrays.
//Space Complexity: O(min(m, n)), if you use the smaller array to limit the size of your HashMap.
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                resultList.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}