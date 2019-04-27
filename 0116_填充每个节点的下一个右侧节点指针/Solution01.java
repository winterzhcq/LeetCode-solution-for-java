
/**
 * @author winter
 * @date 2019/4/27 8:57
 */
public class Solution01 {
    /**
     * 使用递归解决该问题，递归的结束条件就是该节点的左右节点都为空，
     * 递归的子问题，就是将左右子树连接起来，然后构造出原问题的解
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root == null){
            return root;
        }
        if (root.left != null){
            root.left.next = root.right;
        }
        if (root.right != null && root.next != null){
            root.right.next = root.next.left;
        }
        if (root.left != null) {
            connect(root.left);
        }
        if (root.right != null){
            connect(root.right);
        }
        return root;
    }
}
