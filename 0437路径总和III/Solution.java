
/**
 * @author winter
 * @date 2019/11/26 21:17
 */

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    /**
     * 一看见树的结构，首先想到的是递归，解决递归，先找到递归方程
     * 找出路径和等于给定数值的路径总数 = 当前路径的和是sum+左子树的路径和是sum+右子树的路径和是sum
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return helper(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }

    private int helper(TreeNode root, int sum) {
        if (root == null) return 0;
        sum -= root.val;
        return (sum == 0 ? 1 : 0)+helper(root.left,sum)+helper(root.right,sum);
    }
}
