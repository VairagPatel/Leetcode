class Solution {
    public int helper(TreeNode root,int call){
     if(root == null){
        return 0;
      }
      if(root.left == null && root.right == null && call == -1){
        return root.val;
      }
      int lsum = 0;
      int rsum = 0;
      lsum+=helper(root.left,-1);
      rsum+=helper(root.right,0);

      return lsum+rsum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
      return helper(root,0);
    }
}