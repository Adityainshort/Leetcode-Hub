class Solution {
    public long flowerGame(int n, int m) {
        long a = (long) n ;
        long b = (long) m ;
        long o1,o2,e1,e2;
        o1 = (a%2==0) ? a/2 : a/2+1 ;
        o2 = (b%2==0) ? b/2 : b/2+1 ;
        e1 = a/2 ;
        e2 = b/2 ;

        return (o1*e2 + o2*e1) ;

    }
}