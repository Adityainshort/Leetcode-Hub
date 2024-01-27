import java.util.Arrays;

class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length==3){
            return nums[0]+nums[1]+nums[2] ;
        }
        int a = nums[0] ;
        boolean ispresent = false ;
        Arrays.sort(nums);
        for(int i= 0; i<3 ; i++){
            if(nums[i]==a){
                ispresent = true ;
            }
        }
        return (ispresent) ? nums[0]+nums[1]+nums[2] : nums[0]+nums[1]+a ;
        
    }
}