package Leetcode2947;

class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if(s1.charAt(0)==s2.charAt(0) && s1.charAt(0)==s3.charAt(0) ){
            
            int a = Math.min(Math.min( s1.length(), s2.length()), s3.length() );
        int b = Math.max(Math.max( s1.length(), s2.length()), s3.length() );
        
        
        int i = 0 ;
        
        while (i < a && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
            
            
            i++;
        }
        if(i==b)return 0 ;
        
        int ans = s1.length() + s2.length() + s3.length() - 3*i ;
        
        return ans ;
            
        }
        else{
            return -1 ;
        }
        
        
    }
}