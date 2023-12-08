package Leetcode0606;


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
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String result = String.valueOf(root.val); 

        if (root.left == null && root.right == null) {
            return result ;
        }

        if (root.right == null) {
            return result + "(" + tree2str(root.left) + ")";
        }

        if (root.left == null) {
            return result + "()" + "(" + tree2str(root.right) + ")";
        }

        return result + "(" + tree2str(root.left) + ")" + "(" + tree2str(root.right) + ")";
    }
}