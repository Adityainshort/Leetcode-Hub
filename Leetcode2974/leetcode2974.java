import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length] ;
        for(int i =0 ; i<nums.length ; i+=2){
            arr[i] = nums[i+1] ;
            arr[i+1] = nums[i];
        }
         
        return arr;
    }
}
