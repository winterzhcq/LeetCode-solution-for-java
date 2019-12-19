
/**
 * @author winter
 * @date 2019/12/19 21:53
 */

  //Definition for a binary tree node.
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
     *
     * 遇见树，最好的方式是递归，由于是二分搜索树，先找到递归的终止条件
     * 递归的终止条件就是递归到底，然后找到原问题的解可以拆分成哪些子问题
     * 求解原问题的解可以转换为，当遍历的这个节点的值在这个范围，我们加上这个值，
     * 如果不在，看他如果比最小的还要小，我们就遍历他的右子树，如果他比最大的还大
     * 我们就遍历他的左子树，然后组合成原问题的解，代码如下
     * @param root
     * @param L
     * @param R
     * @return
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
