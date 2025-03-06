package by.viachaslau;

import java.util.HashSet;

//Временная сложность O(n): Мы проходим по массиву nums один раз, где n — длина массива.
//Пространственная сложность O(n): В худшем случае, если в массиве нет дубликатов, мы добавим все n элементов в HashSet.
public class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
}