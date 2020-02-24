
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author winter
 * @date 2020/2/24 22:42
 */
// Definition for a Node.


public class Solution02 {
    /**
     * BFS解决，使用队列
     *
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for (Node temp : node.children) {
                    if (node != null) {
                        queue.add(temp);
                    }

                }
            }
        }
        return depth;
    }
}
