/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return help(root.left, root.right);
    }
    public boolean help(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;

        return n1.val == n2.val && help(n1.left, n2.right) && help(n1.right, n2.left);
    }
}