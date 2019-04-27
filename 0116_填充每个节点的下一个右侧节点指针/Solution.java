
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author winter
 * @date 2019/4/27 8:33
 */
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class Solution {
    /**
     * 对树进行一个层次遍历，利用队列先进先出的特性，一层一层的遍历，
     * 遍历每一层的结束条件就是每一层的最左节点出队。
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node current = null;
            while (size > 0){
                Node node = queue.poll();
                if (node.right != null){
                    queue.add(node.right);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                node.next = current;
                current = node;
                size--;
            }
        }
        return root;
    }
}
