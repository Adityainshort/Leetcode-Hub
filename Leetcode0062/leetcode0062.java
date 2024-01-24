class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1] ;

        return solve(m,n,dp);
    }
    public int solve(int m , int n ,int[][] dp){
        if( m==1 && n==1 ){
            return 1;
        }
        int count =0;

        if(dp[m][n]!= 0){
            return dp[m][n];
        }

        if(m!=1 && n!=1){
            count = solve(m-1 ,n,dp) + solve(m,n-1,dp) ;
        }else{
            if(m==1){
                count = solve(m,n-1,dp) ;
            }else{
                count = solve(m-1,n,dp) ;
            }
        }
        

        return dp[m][n]=count ;
    }
}