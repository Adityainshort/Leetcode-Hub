class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int a) {
        int ans=0;
        long n = Integer.toUnsignedLong(a);
        while(n>0){
            ans+=n&1;
            n>>>=1;
        }
        return ans;
    }
}