package Leetcode2540;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // int a = Math.min(nums1.length,nums2.length);
        int j = 0;
        for(int i=0; i<nums1.length  && j<nums2.length; i++){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums1[i]>nums2[j]){
                j++;
                i--;
            }
        }
        return -1;
    }
}