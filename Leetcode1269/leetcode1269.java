package Leetcode1269;

public class leetcode1269 {
    public static int numWays(int steps, int arrlen) {

        return solve( steps ,  arrlen , 0) ;
        
    }
    public static int solve(int steps , int arrlen,int index ){
        if(index<0 || index == arrlen){
            return 0;
        }
        if( steps==0 && index == 0){
            return 1;
        }
        else
        {
         return solve(steps-1,arrlen,index-1)+solve(steps-1,arrlen,index+1)+solve(steps-1,arrlen,index);
        }
    }

    public static void main(String[] args) {
        System.out.println(numWays(3, 2));
    }
}
