


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author winter
 * @date 2019/8/6 21:14
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
}

public class Solution {
    public Node connect(Node root) {
        if (root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node pre = null;
            for (int i = 0; i < size ; i++) {
                 Node temp = queue.poll();
                 // 判断是不是左边第一个节点
                 if (pre != null){
                     pre.next = temp;
                     pre = pre.next;
                 }else
                     pre = temp;
                 if (temp.left != null)
                     queue.add(temp.left);
                 if (temp.right != null)
                     queue.add(temp.right);
            }
            pre.next = null;
        }
        return root;
    }
}
