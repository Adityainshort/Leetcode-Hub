import java.util.HashSet;
import java.util.Set;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length ;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< n +1 ; i++){
            set.add(Integer.parseInt(Integer.toBinaryString(i), 2));
        }
        for(int i = 0 ; i < n ; i++){
            if (set.contains(Integer.parseInt(nums[i], 2))) {
                set.remove(Integer.parseInt(nums[i], 2));
            }
        }
        int ans = -1;
        for (int i : set) {
            ans=i;
            break;
        }

        String m = String.format("%" + n + "s", 
        Integer.toBinaryString(ans)).replace(' ', '0');
        return  m ;
    }
}