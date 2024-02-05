class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        if(word.length()<=k){
            return 1;
        }
        StringBuilder str = new StringBuilder(); 
        
        str.append(word);
            
        int t = 0 ;
        while(!(str.toString().equals(word.substring(0, str.length())) )   || t==0){
            str.delete(0, k);
            t++;
        }
        return t ;
    }
}