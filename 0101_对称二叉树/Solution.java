
/**
 * @author winter
 * @date 2019/3/8 22:25
 */
   class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }

public class Solution {
    /**
     * 递归的结束条件
     * 采用递归解决，把大问题拆分成小问题
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return  isMirror(root,root);
    }
    private boolean isMirror(TreeNode left, TreeNode right) {
        // 递归的结束条件，遍历到两棵树的叶子节点，判断左右叶子节点是否对称
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        //拆分成两个子问题
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
