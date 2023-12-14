class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j]==1) {
                    int c1 = 0;
                    int c2 = 0;
                    for(int k=0; k<mat[0].length; k++) {
                        if(mat[i][k]==0) {
                            c1++;
                        }
                    }
                    for(int k=0; k<mat.length; k++) {
                        if(mat[k][j]==0) {
                            c2++;
                        }
                    }
                    if(c1==mat[0].length-1 && c2==mat.length-1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}