

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
public class Solution {
    /**
     * 采用递归的思想解决，首先处理的是当前根节点cur,如果节点为null或者等于p或则q当中的一个，直接返回cur;
     * 然后处理左右子树，左子树返回left,右子树返回right,判断left和right；
     * 如果left和right都不为空，说明左子树发现了p或q,右子树也发现了p或则q,cur为p和q首次相遇的节点，直接返回cur;
     * 如果left和right其中一个为null，其中一个不为null,说明不为null的节点是p或q当中的一个，或则是pq的最近公共祖先者直接返回不为null的节点；
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val )
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left != null && right != null)
            return root;
       return left != null?left:right;
    }
}
