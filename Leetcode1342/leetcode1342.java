package Leetcode1342;

class Solution {
    public int numberOfSteps(int num) {
        return help(num, 0);
    }
    public int help(int n, int s) {
        if(n==0){
            return s;
        }
        if(n%2==0){
            return help(n/2 , s+1);
        }
        return help(n-1, s+1);
    }
}