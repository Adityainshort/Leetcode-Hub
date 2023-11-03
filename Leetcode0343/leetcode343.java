package Leetcode0343;

public class leetcode343 {
    public static int integerBreak(int n) { 
        if (n<=3) {
            return n;
        }
        int b = n/3;
        int answer ;

        if (n-b*3==1 || n-b*3==2 ) {
            if(n-b*3==1){
                answer = (int) (Math.pow(3, b-1)*4) ;
            }
            else{
                answer = (int) (Math.pow(3, b)*2);
            }
        }
        else{
            answer= (int) Math.pow(3, b);
        }
        
        return answer ;
    }
    public static void main(String[] args) {
        System.out.println(integerBreak(2));
    }
}
