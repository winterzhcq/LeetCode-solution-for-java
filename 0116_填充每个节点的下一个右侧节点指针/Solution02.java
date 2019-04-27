
/**
 * @author winter
 * @date 2019/4/27 9:36
 */
public class Solution02 {
    /**
     * 不借助队列这种数据结构，维护一个每一层的最左Node节点来进行层次遍历
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root == null){
            return root;
        }
        Node cur = root;
        Node tempNode = cur;
        while (cur.left != null){
            cur.left.next = cur.right;
            if (cur.next != null){
                cur.right.next = cur.next.left;
            }else {
                tempNode = tempNode.left;
                cur = tempNode;
                continue;
            }
            cur = cur.next;
        }
        return root;
    }
}
