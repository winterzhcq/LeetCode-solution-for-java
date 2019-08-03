
/**
 * @author winter
 * @date 2019/8/3 16:24
 */

 // Definition for a binary tree node.
   class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        // 这道题的意思是左右节点都为空才算叶子节点
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
    }
}
