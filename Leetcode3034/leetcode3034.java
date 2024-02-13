package Leetcode3034;

class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m =pattern.length+1;
        
        int count =0 ;
        
        for(int i = 0 ; i + m <= n ; i++){
            if(check(nums,pattern,i,i+m)){
                count++;
            }
        }
        
        return count ;
    }
    
    public boolean check(int[] nums, int[] pattern , int i , int j ){
        
        for(int k =0 ; k< pattern.length ;k++ ){
            if(pattern[k] == 1){
                if(!(nums[i + k + 1] > nums[i + k])) return false  ;
            }else
            if(pattern[k] == 0){
                if(!(nums[i + k + 1] == nums[i + k])) return false  ;
            }else
            if(pattern[k] == -1){
                if(!(nums[i + k + 1] < nums[i + k])) return false  ;
            }
        }
        
        return true ;
        
    }
}