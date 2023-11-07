package Leetcode1921;

import java.util.Arrays;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length ;
        float[] t = new float[n];
        for(int i = 0 ; i < n ; i++ ){
            t[i] = (float) Math.ceil((double) dist[i] / speed[i]);
        }

        Arrays.sort(t);
        
        int count = 1 ;

        for(int i = 1 ; i<n ; i++){
            if(count < t[i]){
                count++;
                continue ;
            }
            return count;
        }

        return n ;
    }
}
