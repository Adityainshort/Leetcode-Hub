import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       TreeNode curr = root;
       TreeNode pre;

       while (curr != null) {
           if (curr.left == null) {
               result.add(curr.val);
               curr = curr.right;
           } else {
               pre = curr.left;

               while (pre.right != null) {
                   pre = pre.right;
               }

               pre.right = curr;
               TreeNode temp = curr;
               curr = curr.left;
               temp.left = null;
           }
       }

       return result;
   }
}