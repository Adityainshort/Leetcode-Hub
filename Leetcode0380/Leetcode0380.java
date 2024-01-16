import java.util.ArrayList;
import java.util.HashSet;

class RandomizedSet {

    ArrayList<Integer> arr = new ArrayList<>();
    HashSet<Integer> map = new HashSet<>();

    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        if(map.contains(val)){
            return false ;
        }
        map.add(val);
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.contains(val)){
            Integer a = val;
            arr.remove(a);
            map.remove(a);
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
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */