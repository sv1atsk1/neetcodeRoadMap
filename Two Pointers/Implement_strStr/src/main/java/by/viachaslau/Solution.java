package by.viachaslau;

//Space Complexity - 0(1);
//Time Complexity - O(N*M), N - haystack length, M - needle length;
public class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0)
            return 0;

        if (haystackLength < needleLength)
            return -1;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle))
                return i;
        }
        return -1;
    }

    //Space Complexity - O(M);
    //Time Complexity - O(N + M);
    public int strStrByKMPAlgorithm(String haystack, String needle) {
        int N = haystack.length();
        int M = needle.length();

        if (M == 0) return 0;
        if (N < M) return -1;

        int[] lps = computeLPS(needle);
        int i = 0; // Index for haystack
        int j = 0; // Index for needle

        while (i < N) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == M) {
                    return i - j; // Match found
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // Skip using LPS
                } else {
                    i++; // No match, move to next character in haystack
                }
            }
        }

        return -1;
    }

    private int[] computeLPS(String needle) {
        int M = needle.length();
        int[] lps = new int[M];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < M) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Fall back in the LPS array
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}