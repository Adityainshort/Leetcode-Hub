class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(char e: s.toCharArray()){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else{
                map.put(e,1);
            }
        }
        for(char e: t.toCharArray()){
            if(map.containsKey(e)){
                map.put(e,map.get(e)-1);
            }
        }
        for(int i :map.values()){
            if(i>0){
                ans+=i;
            }
        }

        

        return ans ;

    }
}