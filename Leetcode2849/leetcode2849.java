
class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        fx= sx-fx;
        fy= sy-fy;
        
        if(fx<0)fx=fx*-1;
        if(fy<0)fy=fy*-1;
        if(t==1&&(fx==0&&fy==0))
            return false;

        if(t>=Math.max(fx,fy))
            return true;
        
        return false;
        
    }
}