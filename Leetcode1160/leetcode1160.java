package Leetcode1160;

import java.util.HashMap;

class Solution {
    public int countCharacters(String[] words, String chars) {
       
        HashMap<Character, Integer> map = new HashMap<>(); 
        
        for(char ch: chars.toCharArray()){ 
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        
        int result = 0; 
        
        for(String word: words) { 
            
            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean add = true;
            
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i); 
                if(temp.containsKey(ch) && temp.get(ch) > 0){
                    
                    temp.put(ch, temp.get(ch) -1); 
                } else {
                    add = false;
                    break;
                }
            }
            
            if(add) {
                result += word.length();
            }
        }
        
        return result;
        
    }
}