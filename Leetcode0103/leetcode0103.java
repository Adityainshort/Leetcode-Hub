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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result ;
        }

        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> currlevel = new ArrayList<>();
            int levelsize = queue.size() ;

            for(int i = 0 ; i < levelsize ; i++){
                TreeNode current = queue.poll();

                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }

                currlevel.add(current.val);
            }

            result.add(0,currlevel);
        }
        return result ;
    }    
    
}
