import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public  List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = 0 ;

        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i : nums){
            if(map.containsKey(i)){
                int t = map.get(i)+1;
                map.put(i,t);
                m = (m<t) ? t : m ;
            }
            else{
                map.put(i,0);
            }
        }

        int r = m+1 ;
        int c = map.size();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for(int e : map.keySet()){
                    if (map.get(e) >= i) {
                        j++;
                        temp.add(e);
                        System.out.print(e +" ");
                    }
                }
                result.add(temp);
                break;
            }
            System.out.println();
        }
        

        
        return result ;
         
    }
}