import java.util.ArrayList;
import java.util.HashMap;

class RandomizedCollection {

    ArrayList<Integer> arr = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();

    public RandomizedCollection() {
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val) && map.get(val)>0){
            arr.add(val);
            map.put(val,map.get(val)+1);
            return false ;
        }
        arr.add(val);
        map.put(val,1);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val) && map.get(val)>0 ){
            Integer a = val;
            arr.remove(a);
            map.put(a,map.get(a)-1);
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {

        return arr.get((int)(Math.random() * arr.size()) );   
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */