import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans  = new int[nums.length/3][3] ;
        int index= 0 ;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2 ; i++){

            int[] arr = new int[3] ;
            if(nums[i+2]-nums[i] <=k ){
                arr[0] = nums[i];
                arr[1] = nums[i+1];
                arr[2] = nums[i+2];
            }
            else{
                return new int[0][0];
            }

            ans[index++] = arr ;
            i+=2;

        }

        return ans ;

    }
}