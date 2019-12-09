
/**
 * @author winter
 * @date 2019/12/9 21:56
 */
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}
public class Solution {
    private Node prev = null;

    /**
     * 参考成二叉树，保留先序节点和后续节点的值
     * @param head
     * @return
     */
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private void dfs(Node head) {
        if (head == null) return;
        Node next = head.next;
        if (prev != null) {
            prev.next = head;
            head.prev = prev;
        }
        prev = head;
        dfs(head.child);
        head.child = null;
        dfs(next);
    }
}
