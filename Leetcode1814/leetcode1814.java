class Solution {

    public int reverse(int n) {
        int ans = 0;

        while (n > 0) {
            int r = n % 10;
            ans = ans * 10 + r; 
            n = n / 10;
        }

        return ans;
    }

    public int countNicePairs(int[] nums) {
        final int M = 1000000007;
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - reverse(nums[i]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            
            int a = map.getOrDefault(nums[i], 0);

            ans = (int) ((ans + a) % M);
            map.put(nums[i], a + 1);
        }

        return ans;
    }
}