package Leetcode0867;

class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length , columns = matrix[0].length;

        int[][] ans = new int[columns][rows];
        
        for (int j = 0; j < columns; j++){
            for (int i = 0; i < rows; i++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}