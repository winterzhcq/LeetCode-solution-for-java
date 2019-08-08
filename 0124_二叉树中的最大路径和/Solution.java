

/**
 * @author winter
 * @date 2019/8/7 21:16
 */

  //Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
       int max_sum;
    public int maxPathSum(TreeNode root) {
         max_sum = Integer.MIN_VALUE;
        helper(root);
        return max_sum;
    }

    private int helper(TreeNode node) {
        if (node == null)
            return 0;
        // 查询左节点最大的连续和
        int max_left = Math.max(helper(node.left),0);
        // 查找右节点最大连续和
        int max_right = Math.min(helper(node.right),0);
        max_sum = Math.max(max_sum,max_left+max_right+node.val);
        // 找出最大的路径
        return node.val + Math.max(max_left,max_right);
    }
}
