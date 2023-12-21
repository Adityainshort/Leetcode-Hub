class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int l = points.length;
        int arr[] = new int[l];
        for(int i=0;i<l;i++){
            arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        
        int maxdif = Integer.MIN_VALUE;
        
        for(int i=1;i<l;i++){
            if((arr[i]-arr[i-1])>maxdif){
                maxdif=arr[i]-arr[i-1];
            }
        }
        return maxdif;
    }
}