class Solution {
    int ans = 0;
    public int countNodes(TreeNode root) {
        if(root==null) return ans;
        ans+=1;
        countNodes(root.left);
        countNodes(root.right);
        return ans;
    }
}