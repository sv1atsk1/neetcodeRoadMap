package by.viachaslau;

import java.util.HashMap;


// Временная сложность: O(n), где n — длина строки.
// Пространственная сложность: O(1) (поскольку массив фиксированного размера).
public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    // Временная сложность: O(n) n — длина строк
    // Пространственная сложность: O(k) k — количество уникальных символов в строках.
    public boolean isAnagramWithHashMaps(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapForString1 = new HashMap<>();
        HashMap<Character, Integer> mapForString2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            mapForString1.put(currentChar, mapForString1.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            mapForString2.put(currentChar, mapForString2.getOrDefault(currentChar, 0) + 1);
        }

        return mapForString1.equals(mapForString2);
    }
}