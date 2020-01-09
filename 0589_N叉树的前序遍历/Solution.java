
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2020/1/9 21:02
 */
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        help(root, list);
        return list;
    }

    private void help(Node root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        for (Node node : root.children) {
            help(node, list);
        }
    }

}
