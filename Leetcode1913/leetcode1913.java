class Solution {
    public int maxProductDifference(int[] nums) {
        int largest=0;
        int slargest=0;
        int smallest=Integer.MAX_VALUE;
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]>largest)
            {
                slargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>slargest)
            {
                slargest= nums[i];
            }
            
            if(nums[i]<smallest)
            {
                ssmallest=smallest;
                smallest=nums[i];
            }
            else if(nums[i]<ssmallest)
            {
                ssmallest=nums[i];
            }
        }
        return (largest*slargest)- (smallest*ssmallest);
    }
}