package cn.winter.leetcode.q235;

/**
 * @author winter
 * @date 2018/10/20 14:54
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class Solution {
   /* 　这道题我们可以用递归来求解，我们首先来看题目中给的例子，由于二叉搜索树的特点是左<根<右，
     所以根节点的值一直都是中间值，大于左子树的所有节点值，小于右子树的所有节点值，那么我们可以做如下的判断，
     如果根节点的值大于p和q之间的较大值，说明p和q都在左子树中，那么此时我们就进入根节点的左子节点继续递归，
     如果根节点小于p和q之间的较小值，说明p和q都在右子树中，那么此时我们就进入根节点的右子节点继续递归，
     如果都不是，则说明当前根节点就是最小共同父节点，直接返回即可。
     掌握递归与回溯，从宏观和围观理解递归
     */

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if (root == null || root.val == p.val || root.val == q.val)
            return root;
        if (root.val > Math.max(p.val,q.val)) {
            return lowestCommonAncestor(root.left,p,q);
        }else if (root.val < Math.min(p.val,q.val)){
            return  lowestCommonAncestor(root.right,p,q);
        }
            return root;
    }
}
