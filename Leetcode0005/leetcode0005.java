package leetcode.Leetcode0005;

public class leetcode0005 {
        public String longestPalindrome(String s) {
            int n = s.length();
            boolean[][] dp = new boolean[n][n];
            int maxLen = 1;
            int start = 0;
            
            // every string of length 1 is a palindrome
            for(int i = 0; i < n; i++) {
                dp[i][i] = true;
            }
            
            // check for strings of length 2
            for(int i = 0; i < n - 1; i++) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    dp[i][i+1] = true;
                    maxLen = 2;
                    start = i;
                }
            }
            
            // check for strings of length greater than 2
            for(int len = 3; len <= n; len++) {
                for(int i = 0; i < n - len + 1; i++) {
                    int j = i + len - 1;
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                        dp[i][j] = true;
                        if(len > maxLen) {
                            maxLen = len;
                            start = i;
                        }
                    }
                }
            }
            
            return s.substring(start, start + maxLen);
        }
    
}
