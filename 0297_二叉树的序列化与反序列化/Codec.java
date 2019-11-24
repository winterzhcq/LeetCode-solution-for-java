
import java.util.*;

/**
 * @author winter
 * @date 2019/11/24 18:46
 */

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(null == root) return "#";
        StringBuilder sb = new StringBuilder();
        sb.append(root.val)
                .append(",").append(serialize(root.left))
                .append(",").append(serialize(root.right));

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        if(arr.length == 0) return null;
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr));
        return des(queue);
    }

    public TreeNode des(Queue<String> queue) {
        if(queue.size() == 0) return null;

        String cur = queue.poll();
        if("#".equals(cur)) return null;

        TreeNode root = new TreeNode(Integer.valueOf(cur));

        root.left = des(queue);
        root.right = des(queue);
        return root;
    }
}
