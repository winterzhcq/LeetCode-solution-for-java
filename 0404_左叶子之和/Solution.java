
/**
 * @author winter
 * @date 2019/11/25 20:32
 */

// Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if (root.left != null &&  root.left.left == null && root.left.right == null )
            return sumOfLeftLeaves(root.right)+root.left.val;
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);
        return left+right;
    }

}
