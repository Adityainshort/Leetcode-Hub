import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result ;
        }

        Deque<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        Boolean reverse = false ;

        while(!queue.isEmpty()){

            List<Integer> currlevel = new ArrayList<>();
            int levelsize = queue.size() ;

            if(!reverse){
                for(int i = 0 ; i < levelsize ; i++){
                    TreeNode current = queue.pollFirst();

                    if(current.left!=null){
                        queue.addLast(current.left);
                    }
                    if(current.right!=null){
                        queue.addLast(current.right);
                    }

                    currlevel.add(current.val);
                }

            }else{
                for(int i = 0 ; i < levelsize ; i++){
                    TreeNode current = queue.pollLast();

                    if(current.right!=null){
                        queue.addFirst(current.right);
                    }
                    if(current.left!=null){
                        queue.addFirst(current.left);
                    }

                    currlevel.add(current.val);
                }
                    
            }
            reverse=!reverse;

            result.add(currlevel);
            
        }
        return result ;
    }
}

