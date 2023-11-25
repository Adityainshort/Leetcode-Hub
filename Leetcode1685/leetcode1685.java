class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int s  = 0 ;
        int n = nums.length ;
        for(int a : nums){
            s+=a;
        }
        int s2 = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            int a = nums[i] ;
            s-=a;
            nums[i] = s-(n-i-1)*a + i*a-s2 ;
            s2+=a;
        }
        return nums;
    }
}