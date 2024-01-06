class Solution {
    public int[] plusOne(int[] n) {
        for(int i = n.length-1 ; i>=0 ; i--){
            if(n[i]<9){
                n[i]+=1;
                return n ;
            }
            else {
                n[i]=0;
            }
        }

        int[] nn = new int [n.length+1];
        nn[0] = 1;

        return nn ;
    }
}