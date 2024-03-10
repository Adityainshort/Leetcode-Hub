package Leetcode0349;

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int i : nums2){
            if(set.contains(i)){
                set2.add(i);
            }
        }
        int[] ans = new int[set2.size()];
        int c = 0;
        for(int i : set2){
            ans[c++]=i;
        }
        return ans ;
    }
}