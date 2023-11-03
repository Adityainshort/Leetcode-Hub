package Leetcode0125;

class leetcode0125 {
    public static  boolean isPalindrome(String s) {
        String str = "";
        for(int i = 0 ;i < s.length() ; i++ ){
            int n =(int)(s.charAt(i));
            if(  (65<=n && n<=90) ||  (97<=n && n<=122) || (48<=n && n<=57) ){
                str = str +  Character.toUpperCase(s.charAt(i));
            }
        }
        int i = 0, j=str.length()-1;
        while (i<j) {
            if (str.charAt(i)!=str.charAt(j)) {
                return false ;
            }
            i++;
            j--;
        }
        return true;
        
    
}
    public static void main(String[] args) {

        String s ="A man, a plan, a canal: Panama";
        System.out.println(s);
        System.out.println("Is palindrome : "+isPalindrome(s));
        

    }
}