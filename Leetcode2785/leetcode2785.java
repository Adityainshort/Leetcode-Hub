package Leetcode2785;

import java.util.Arrays;

class Solution {
    public static String sortVowels(String s) {
        int j = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))) {
                j++;
            }
        }
        char[] arr = new char[j];
        j=0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))) {
                arr[j] = s.charAt(i);
                j++;
            }
        }
        Arrays.sort(arr);
        j=0;
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))) {
                ans.setCharAt(i,arr[j]);
                j++;
            }
        }

        return ans.toString() ;
    }
}