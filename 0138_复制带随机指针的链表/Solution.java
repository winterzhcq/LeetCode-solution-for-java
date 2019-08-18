

import java.util.HashMap;

/**
 * @author winter
 * @date 2019/8/18 21:26
 */
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
public class Solution {
    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if(head == null)
            return head;
        if (this.visitedHash.containsKey(head)) {
            return this.visitedHash.get(head);
        }
        Node node = new Node(head.val, null, null);
        this.visitedHash.put(head, node);
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
