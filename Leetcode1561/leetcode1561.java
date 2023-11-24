package Leetcode1561;

import java.util.Arrays;

class Solution {
    public int maxCoins(int[] p) {

        Arrays.sort(p);
        int ans = 0 ;
        for(int i = p.length -2  ; i >=(p.length/3); i-=2){
            ans+=p[i];
        }
        return ans ;
    }
}