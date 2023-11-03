package Leetcode1313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode1313
 */
public class leetcode1313 {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i =0;
        
        while (i<nums.length) {
            if (nums[i]!=0) {
                int freq = nums[i];
                int val = nums[i+1];
                for (int j=0;j<freq;j++) {
                    list.add(val);
                    System.out.println(val);
                }
                i+=2;
            }
            else{
                i+=2;
            }
        }
        int[] a= new int[list.size()];
        for (int j = 0; j < a.length; j++) {
            a[j] = list.get(j).intValue();
        }
        return  a;
        
    }

    public static void main(String[] args) {
        int[] nums= {0,2,0,4,0,6};
        int[] a =decompressRLElist(nums);
        System.out.println(Arrays.toString(a));

    }
}