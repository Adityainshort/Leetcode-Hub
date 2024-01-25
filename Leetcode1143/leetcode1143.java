class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()] ;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return solve(s1,s2,0,0 ,dp);
    }

    public int solve(String s1, String s2 , int i , int j , int[][] dp){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ;
        }


        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]  = solve(s1,s2,i+1,j+1,dp) + 1 ;
        }
        else{
            return  dp[i][j] = Math.max( solve(s1,s2,i+1,j,dp) , solve(s1,s2,i,j+1,dp) ) ;
        }
    }
}