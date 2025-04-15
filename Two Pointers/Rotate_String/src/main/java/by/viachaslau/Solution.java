package by.viachaslau;

//Space Complexity - O(1);
//Time Complexity - O(n);
public class Solution {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}