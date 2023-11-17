import java.util.Arrays;

class Solution {
    public  int minPairSum(int[] nums) {
        int n = nums.length;
        if(n==2) return nums[0]+nums[1] ;
        
        Arrays.sort(nums);
        int[] a1 = Arrays.copyOf(nums, n/2);
        int[] a2 = Arrays.copyOfRange(nums,n/2,n);
        int[] a3 = new int[n/2];
        for (int i = 0; i < n/2 ; i++) {
            a3[i] = a1[i] + a2[n/2-i-1] ;
        }
        Arrays.sort(a3);
        
        return a3[n/2-1];
    }
}