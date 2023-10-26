package leetcode.Leetcode0823;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode0823 {
    public static int numFactoredBinaryTrees(int[] arr) {

        HashMap<Integer, Long> map = new HashMap<>();

        for (Integer key : arr) {
            map.put(key, 1L);
        }
        
        Arrays.sort(arr);
        int modulo = (int) (Math.pow(10, 9) + 7);

        int n = arr.length;
        int i = 0 ;

        while(i<n){
            long curr_count=1;

            if(i!=0){
                for(int j = 0 ; j<i ;j++){
                    if(arr[i]%arr[j]==0){
                        if(map.containsKey(arr[i]/arr[j])){
                            curr_count+= (map.get(arr[j])*map.get((arr[i]/arr[j])));
                        }
                    }
                }
            }
            map.put(arr[i], curr_count % modulo);
            i++;
        }

        long ans = 0;
        for(long val : map.values()){
            ans += val % modulo;
        }

        int result = (int) (ans % modulo);


        return result;
    }

    public static void main(String[] args) {
        int [] arr={2,4};
        System.out.println(numFactoredBinaryTrees(arr));
    }
}
