

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean check(List<Integer> arr) {
        arr.sort(null);
        int n = arr.size();

        int d = arr.get(1) - arr.get(0);

        for (int i = 2; i < n; i++) {
            if (arr.get(i) - arr.get(i - 1) != d) {
                return false;
            }
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = l[i]; j <= r[i]; j++) {
                arr.add(nums[j]);
            }

            ans.add(check(arr));
        }

        return ans;
    }
}