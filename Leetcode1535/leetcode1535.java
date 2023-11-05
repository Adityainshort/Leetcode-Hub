package Leetcode1535;

class Solution {
    public static int getWinner(int[] arr, int k) {

        int winner = arr[0];
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){

            int count = 0 ;
            

            if(i==1) count =-1 ;

            while(count<k-1){  
                if(i<arr.length && winner<arr[i]){
                    winner=arr[i];
                    break ;
                }
                i++;
                count++;
            }
            if(winner>max){
                max=winner;
            }

            if(count==k-1){
                return winner ;
            }
        }

        return max ;
    }

    public static void main(String[] args) {
        int[ ] arr = {1,25,35,68,42,70};
        System.out.println(getWinner(arr, 3));
        
    }
}