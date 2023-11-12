package Leetcode0268;

public class leetcode0268 {
    public int missingNumber(int[] nums) {
        int sum =0;
        for(int i: nums){
            sum=sum+i;
        }
        sum = (nums.length*nums.length +nums.length)/2 - sum;
        return sum ;
    }
}
