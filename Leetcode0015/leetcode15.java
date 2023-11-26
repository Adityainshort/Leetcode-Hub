import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

   public static   List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> uniq = new HashSet<>();

        for(int i= 0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1; j<n;j++){
                if(set.contains(-nums[i]-nums[j])){
                    List<Integer> temp =new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(-nums[i]-nums[j]);
                    Collections.sort(temp);
                    if(!uniq.contains(temp)){
                        ans.add(temp);
                        uniq.add(temp);
                    }
                }
                else{
                    set.add(nums[j]);
                }
            }
        }
        return ans;
    }


       
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

}