package Leetcode3074;

import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int ta = 0 ;
        for(int i : apple){
            ta=ta+i;
        }
        Arrays.sort(capacity);
        
        int i = capacity.length-1 ;
        int c= 0 ;
        while(ta>0 && i>=0){
            ta=ta-capacity[i];
            i--;
            
            c++;
        }
        return c ;
    }
}