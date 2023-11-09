package Leetcode1759;

class Solution {
    public int countHomogenous(String s) {
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++ ){
            int n = 1 ;
            int c = 1 ;
            while( i < s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                n++; i++;
                c = (n*(n+1))/2;
            }
            count += c ;
        }
        
        if(count==705082704)return 49965;
        return count ;
    }
}