import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean closeStrings(String a, String b) {
        if(a.length()!=b.length()){
            return false ;
        }
        int[] mapi = new int[26];
        int[] napi = new int[26];

        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : a.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashMap<Character,Integer> nmap = new HashMap<>();
        for(char i : b.toCharArray()){
            nmap.put(i, nmap.getOrDefault(i, 0) + 1);
        }

        int j = 0 ;
        for(int i : map.values()){
            mapi[j] = i ;
            j++;
        }
        j=0;
        for(int i : nmap.values()){
            napi[j] = i ;
            j++;
        }
        Arrays.sort(mapi);
        Arrays.sort(napi);

        for(int i = 0; i<mapi.length ; i++){
            if( mapi[i] != napi[i] ){
                return false ;
            }
        }

        return map.keySet().equals(nmap.keySet());
    }
}