import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class leetcode1743 {

    static int first, last, current;

    public static int[] restoreArray(int[][] adjacentPairs) {

        HashMap<Integer, ArrayList<Integer>> a = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int[] ar : adjacentPairs) {

            for (int i = 0; i < 2; i++) {
                if (set.contains(ar[i])) {
                    set.remove(ar[i]);
                } else {
                    set.add(ar[i]);
                }
            }


            if (a.containsKey(ar[0]) || a.containsKey(ar[1])) {

                if (!a.containsKey(ar[0])) { // 1 is present only
                    // Adding 0 updating 1
                    ArrayList<Integer> temp = new ArrayList<>();
                    //Adding 0 
                    temp.add(ar[1]);
                    a.put(ar[0], temp); 
                    // updating 1
                    temp = new ArrayList<>(a.get(ar[1])); 
                    temp.add(ar[0]);
                    a.put(ar[1], temp);

                } else if (!a.containsKey(ar[1])) { // 0 is present only
                    // Adding 1 updating 0
                    ArrayList<Integer> temp = new ArrayList<>();
                    //Adding 1 
                    temp.add(ar[0]);
                    a.put(ar[1], temp); 
                    // updating 0
                    temp = new ArrayList<>(a.get(ar[0])); 
                    temp.add(ar[1]);
                    a.put(ar[0], temp);

                } else {
                    // Updating 0 and 1
                    ArrayList<Integer> temp = new ArrayList<>(a.get(ar[0])); 
                    // updating 0
                    temp.add(ar[1]);
                    a.put(ar[0], temp);
                    temp = new ArrayList<>(a.get(ar[1])); 
                    // updating 1
                    temp.add(ar[0]);
                    a.put(ar[1], temp);

                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(ar[1]);
                a.put(ar[0],temp);
                ArrayList<Integer> tempo = new ArrayList<>();
                tempo.add(ar[0]);
                a.put(ar[1], tempo);
            }
            
            
        }
        int i = 0 ;
        for (Integer fi : set) {
            if (i==0) {
                first = fi ;
                i++;
                continue;
            }
            last =fi ;
            break;
        }
        
        int[] ans = new int[adjacentPairs.length +1];
        
        ans[0] = first ;
        ArrayList<Integer> temp = new ArrayList<>(a.get(first));
        current = temp.get(0) ;
        for ( i = 1; i < adjacentPairs.length; i++) {
            ans[i]=current;
            ArrayList<Integer> curr = new ArrayList<>(a.get(current));
            Integer r = first; 
            curr.remove(r);
            first = current ;
            current= curr.get(0);
        }
        ans[ans.length-1]=current;

        return ans;
    }

    public static void main(String[] args) {
        int[][] ar = { { 4, -2 }, { 4, 1 }, { -3, 1 } };

        // restoreArray(ar);

        for (int is : restoreArray(ar)) {
            System.out.println(is);
        }
    }

}