package Leetcode1207;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        HashSet<Integer> unique = new HashSet<>();
        for (int y : map.keySet()){
            unique.add(map.get(y));
        }
        
        //we can also use et<Integer> set = new HashSet<>(map.values()); to do above task in a line...
        return (map.size()==unique.size());
    }

    public static void main(String[] args) {
        int []arr={1,2,2,3,3,4,2,5,};
        System.out.println("true or false: "+uniqueOccurrences(arr));

    }
}
