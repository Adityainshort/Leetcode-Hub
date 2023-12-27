class Solution {
    public int minCost(String colors, int[] neededTime) {
        int start = 0 , end  = 0 , totaltime = 0  ;
        for(int i=0 ; i<colors.length() ; i++){
            if(i<colors.length()-1 && colors.charAt(i)==colors.charAt(i+1)){
                start = i ;
                while(i<colors.length()-1 && colors.charAt(i)==colors.charAt(i+1)){
                    i++;
                    end=i;  
                }
                totaltime += mintime(start,end,neededTime);
            }
        }

        return totaltime ;
    }

    public int mintime(int start ,int end,int arr[]){
        int largest = 0 , sum = 0 ;
        for(int i = start ; i<= end ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            sum+=arr[i];
        }
        return sum - largest ;
    }
}