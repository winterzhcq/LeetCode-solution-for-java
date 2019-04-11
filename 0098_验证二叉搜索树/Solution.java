
/**
 * @author winter
 * @date 2019/4/8 15:50
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class Solution {
    /**
     * 采用递归的思想解决，递归的结束条件，也就是递归要解决的最根本的问题就是判断下面这两种情况：
     * 1.要么遍历到null节点，直接返回true，然后再回溯回去
     * 2.对于左子树，不满足的条件是左叶子节点比父节点还大，或者左叶子节点比父节点小，但是比父节点的父节点还小
     *   对于右子树，不满足的条件是右叶子节点比父节点还小，或则右叶子节点比父节点大，但是比父节点的父节点还大
     *   对应的情况如下
     *          3                    5
     *           \                 /
     *     2     5      3         4
     *    /     /        \         \
     *   3     4          2         6
     * 把求解是否是二叉搜索树树转换成求该树的左右子树是否是二搜索叉树
     * 把左右子树的解组合成原问题的解
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
       return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if (root == null){
            return true;
        }
        if(root.val >= maxValue || root.val <= minValue){
            return false;
        }
        return isValidBST(root.left,minValue,root.val) && isValidBST(root.right,root.val,maxValue);
    }
}
