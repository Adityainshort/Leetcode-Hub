class Solution {
    public int minimumArrayLength(int[] nums) {
        
        int v = nums[0], count = 0;

        for (int a: nums){
            v = Math.min(v, a); 
        }
            
        for (int a : nums){

            if (a % v > 0){
                return 1;
            }
        }

        for (int a : nums){
            if (a == v){
                count++;
            }
        }

        return (count + 1) / 2;
    }
}