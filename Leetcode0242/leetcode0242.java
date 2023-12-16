import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
      
      
        if(s.length()!=t.length()){
            return false;
        }

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        int i=0 ;
        while (i<sa.length){
            if(sa[i]==ta[i]){
                i++;
                continue ;
            }
            else{
                return false ;
            }
        }
        return true ;

    }
}