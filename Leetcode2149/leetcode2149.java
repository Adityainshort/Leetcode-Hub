class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] n = new int[nums.length/2];
        int[] p = new int[nums.length/2];
        int a = 0 ;
        int b = 0 ;
        for(int i :nums){
            if(i>0) p[a++]=i;
            if(i<0) n[b++]=i;
        }
        int k=0;
        for(int i=0; i<nums.length ; i+=2){
            nums[i]=p[k++];
        }
        k=0;
        for(int i=1; i<nums.length ; i+=2){
            nums[i]=n[k++];
        }
        return nums;
    }
}