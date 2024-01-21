class Solution {
    int[] dp = new int[100];
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
    public int solve(int[] nums , int i ){
        if(i>=nums.length){
                return 0;
            
        }
        if(dp[i]!=-1){
            return dp[i] ;
        }

        int a = nums[i] + solve(nums,i+2);
        int b = solve(nums,i+1);
        return dp[i] = Math.max(a,b);
    }
}