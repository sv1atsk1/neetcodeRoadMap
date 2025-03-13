package by.viachaslau;

import java.util.HashMap;

//Time complexity: O(n)
//Space complexity: O(m)
public class Solution {
    public int characterReplacement(String s, int k) {

        int result = 0;
        HashMap<Character, Integer> lettersCountHashMap = new HashMap<>();
        int leftPointer = 0;
        int longestReapitingCharacterCounter = 0;
        for (int r = 0; r < s.length(); r++) {
            lettersCountHashMap.put(s.charAt(r), lettersCountHashMap.getOrDefault(s.charAt(r), 0) + 1);
            longestReapitingCharacterCounter = Math.max(longestReapitingCharacterCounter, lettersCountHashMap.get(s.charAt(r)));

            while ((r - leftPointer + 1) - longestReapitingCharacterCounter > k) {
                lettersCountHashMap.put(s.charAt(leftPointer), lettersCountHashMap.get(s.charAt(leftPointer)) - 1);
                leftPointer++;
            }
            result = Math.max(result, r - leftPointer + 1);
        }
        return result;
    }
}