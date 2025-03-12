package org.example;

import java.util.HashSet;

//Time Complexity - O(n)
//Space Complexity - O(m)
//Where n is the length of the string and m is the total number of unique characters in the string.
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characterHashSet = new HashSet<>();
        int l = 0;
        int result = 0;

        for (int r = 0; r < s.length(); r++) {
            while (characterHashSet.contains(s.charAt(r))) {
                characterHashSet.remove(s.charAt(l));
                l++;
            }
            characterHashSet.add(s.charAt(r));
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}