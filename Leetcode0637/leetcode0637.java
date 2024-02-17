import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelsize = queue.size() ;
            Double sum = 0.00 ;
            for(int i = 0 ; i < levelsize ; i++){
                TreeNode current = queue.poll();
                sum +=current.val;
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            Double average = sum/levelsize;
            result.add(average);
        }
        return result ;
    }
}