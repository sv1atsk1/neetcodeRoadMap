package by.viachaslau;

import java.util.*;

// Временная сложность: O(m * n), где m — количество строк, а n — длина самой длинной строки, из-за сортировки каждой строки.
// Пространственная сложность: O(m), для хранения списка анаграмм в хэш-таблице.
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int number : count) {
                key.append('#');
                key.append(number);
            }

            anagramMap.putIfAbsent(key.toString(), new ArrayList<>());
            anagramMap.get(key.toString()).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}