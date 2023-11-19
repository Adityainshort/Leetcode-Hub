class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        if(nums[0] == nums[n-1]) return 0 ;
        int a = 0 ;
        int ans =0;

        for(int i = 0 ; i<n ; i++ ){
            int count = 1 ;
            while( i<n-1 && nums[i] == nums[i+1] ){
                i++;
                count++;
            }
            ans += count*a ;
            a++;
        }

        return ans ;
    }
}