import java.util.Arrays;

class Solution {
    private int n;
    private int[] dp;

    public int maxSumAfterPartitioning(int[] arr, int k) {
        n = arr.length;
        dp = new int[501];
        Arrays.fill(dp, -1);
        return solve(arr, 0, k);
    }

    private int solve(int[] arr, int idx, int k) {
        if (idx >= n) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        int result = 0;
        int currMax = -1;
        
        for (int i = idx; (i < n) && (i <= k + idx - 1 ) ; i++) {
            currMax = Math.max(currMax, arr[i]);

            result = Math.max(result, currMax * (i - idx + 1) + solve(arr, i + 1, k));
        }

        return dp[idx] = result;
    }
}