

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class leetcode515 {
    public class TreeNode {
    
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
    

    public List<Integer> largestValues(TreeNode root) {
        
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> result = new ArrayList<>();

        while(queue.isEmpty()){
            int n = queue.size();
            int max = Integer.MIN_VALUE;
            while (n>0) {
                TreeNode node = queue.element();
                queue.remove();
                max=Math.max(max, node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
                n--;

            }
            result.add(max);
            
            
        }
        return result;
    }
}
