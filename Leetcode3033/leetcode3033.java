package Leetcode3033;

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] largest = new int[matrix[0].length] ;
        
        for(int[] i: matrix){
            int index=0;
            for(int j : i){
                if(j>largest[index]){
                    largest[index]=j;
                }
                index++;
            }
        }
        int row =0;
        for(int[] i: matrix){
            int index=0;
            for(int j :i){
                if(j==-1){
                    matrix[row][index]=largest[index];
                }
                index++;
            }
            row++;
        }
        return matrix;
    }
}