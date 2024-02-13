class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(check(s)){
                return s ;
            }
        }
        return new String("");
    }
    public boolean check(String s){
        int i = 0 , j = s.length()-1 ;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false ;
            }
            i++;j--;
        }
        return true ;
    }
}