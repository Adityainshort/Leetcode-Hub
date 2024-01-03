class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0 ,a=0,b=0;
        for(int i = 0 ; i <bank.length ; i++){
            int sum = 0 ;
            for(int j = 0 ;j<bank[0].length() ; j++){
                if(bank[i].charAt(j)=='1') sum++ ;
            }
            if(a==0 && sum!=0){
                a=sum;
            }
            else if(sum!=0){
                b=sum ;
                ans+=a*b;
                a=b;
            }
        }
        return ans ;
    }
}