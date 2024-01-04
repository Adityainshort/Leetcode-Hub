import java.util.HashMap;

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int result = 0 ;
        for(int e : nums){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else{
                map.put(e,1);
            }
        }
        for(int e : map.values()){
            if(e>1){
                // if(e==2) result++;

                result += (e%3==0) ? e/3 : e/3+1 ;
            }
            else{
                return -1;
            }
        }
        return result ;
    }
}