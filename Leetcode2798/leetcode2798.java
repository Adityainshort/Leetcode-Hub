package leetcode.Leetcode2798;

/**
 * leetcode2798
 */
public class leetcode2798 {
    public int number(int n , int[] arr){
        int count=0;
        
        for (int i=0;i<arr.length;i++) {
            if (n<=arr[i]) {
                count ++;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        leetcode2798 ai = new leetcode2798();
        System.out.println(ai.number(1,new int[]{}));
    }
}