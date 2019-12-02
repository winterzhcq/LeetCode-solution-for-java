
/**
 * @author winter
 * @date 2019/12/2 21:08
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    /**
     * 简单的递归，递推方程
     * 1.原问题 求两个数合并
     * 2.结束条件，左右子树任一个为null就返回另一个不为null的树
     * 3，子问题，合并左子树，合并右子树
     * 4.返回原问题的解
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }
}
