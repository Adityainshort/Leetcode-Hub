class Solution {
    Integer dp[][][];
    int M = (int)1e9+7;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        dp = new Integer[m][n][maxMove+1];
        return solve(m,n,maxMove,startRow,startColumn);

    }

    public int solve(int m , int n , int max , int a , int b){
        if( a<0||a>=m || b<0||b>=n ){
            return 1;
        }
        if(max==0){
            return 0;
        }
        if(dp[a][b][max]!=null){
            return dp[a][b][max];
        }

        int ans = 0 ;
        ans = (ans +solve(m,n,max-1,a+1,b) )%M;
        ans = (ans +solve(m,n,max-1,a-1,b) )%M;
        ans = (ans +solve(m,n,max-1,a,b+1) )%M;
        ans = (ans +solve(m,n,max-1,a,b-1) )%M;

        return dp[a][b][max] = ans;
    }
}