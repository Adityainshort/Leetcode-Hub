

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * leetcode15
 */
public class leetcode15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        List<List<Integer>> listOfLists = new ArrayList<>();
        for(int i= 0;i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int k=j+1; k<n;k++){
                    if( nums[i] + nums[j] + nums[k] ==0){
                        List<Integer> innerList1 = new ArrayList<>();
                            innerList1.add(nums[i]);
                            innerList1.add(nums[j]);
                            innerList1.add(nums[k]);
                        listOfLists.add(innerList1);
                    }
                }
            }
        }
        return removeDuplicate(listOfLists);
    }
    public static  List<List<Integer>> removeDuplicate(List<List<Integer>> listofLists) {
        Set<List<Integer>> uniqueLists = new HashSet<>();
        for(List<Integer> sorted : listofLists ){
            sorted.sort(null);
            if(!uniqueLists.contains(sorted)){
                uniqueLists.add(sorted);
            }
        }
        return new ArrayList<>(uniqueLists);
    }

       
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

}