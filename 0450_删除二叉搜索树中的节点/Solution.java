
/**
 * @author winter
 * @date 2019/12/18 21:30
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
     * 删除二叉树的指定key，先遍历找到这个key所在节点，删除该节点并保证二叉树的原有顺序
     * 方法一：找到该节点的左子树的最大值节点，替换并删除左子树的最右节点
     * 方法二：找到该节点的右子树节点的最小值，替换删除右子树的最左节点
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if ( key < root.val){
            root.left = deleteNode(root.left,key);
            return root;
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
            return root;
        }else {
            // 待删除的左子节点为null
            if (root.left == null) {
                TreeNode rightNode = root.right;
                root.right = null;
                return rightNode;
            }
            // 待删除的右子节点为null
            if (root.right == null){
                TreeNode leftNode = root.left;
                root.left = null;
                return leftNode;
            }
            // 待删除的左右节点都不为空的情况
            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点，或则删除左子树的最大节点
            // 用这个节点顶替待删除节点的位置
            // 方法1：即待删除节点右子树的最小节点
            TreeNode successor = maxmum(root.left);
            successor.left = removeMax(root.left);
            successor.right = root.right;
            root.left = root.right = null;
            return successor;
        }
    }

    private TreeNode removeMax(TreeNode node) {
        if (node.right == null){
            TreeNode leftNode = node.left;
            node.left = null;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    private TreeNode maxmum(TreeNode node) {
        if (node.right == null) return node;
        return maxmum(node.right);
    }
}
