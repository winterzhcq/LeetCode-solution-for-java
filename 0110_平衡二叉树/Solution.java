

/**
 * @author winter
 * @date 2019/8/3 15:41
 */
 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        return helper(root) != -1;
    }

    private int helper(TreeNode node) {
        if (node == null)
            return 0;
        int left = helper(node.left);
        if (left != -1){
            int right = helper(node.right);
            if (right != -1){
                return Math.abs(left - right) <= 1 ? Math.max(left,right) + 1 : -1;
            }
        }
        return -1;
    }
}