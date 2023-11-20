package Leetcode2391;

class Solution {
    public static int garbageCollection(String[] garbage, int[] travel) {
        int last_m = 0 , m = 0 ;
        int last_p = 0 , p = 0 ;
        int last_g = 0 , g = 0 ;

        for(int i = 0 ; i < garbage.length ; i++){
            String s = garbage[i] ;
            if( i>0 && i < travel.length ){
                travel[i]+=travel[i-1]; 
            }
            for(char ch : s.toCharArray()){
                if (ch == 'M' ) {
                    m++;
                    last_m = i ;
                } else if (ch == 'P') {
                    p++;
                    last_p = i ;
                } else if (ch == 'G') {
                    g++;
                    last_g = i ;
                }
            }
        }
        int a = (m==0)? 0 : m + ((last_m==0)? 0 : travel[last_m-1]) ;
        int b = (p==0)? 0 : p + ((last_p==0)? 0 : travel[last_p-1]) ;
        int c = (g==0)? 0 : g + ((last_g==0)? 0 : travel[last_g-1]) ;

        return a + b + c ;
    }
    public static void main(String[] args) {
        String[] arr  = {"G","P","GP","GG"};
        int[] tar   = {2,4,3};
        System.out.println("The number of garbage collection is " + garbageCollection(arr,tar));
    }
}