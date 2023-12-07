class Solution {
    public String largestOddNumber(String num) {
        int a = num.length() -1 ;
        while((int)(num.charAt(a)) %2==0){
            a--;
            if(a<0){return "" ;}
        }
        return num.substring(0,a+1);
    }
}