
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author winter
 * @date 2019/11/27 20:56
 */

//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    /**
     * 二叉树的遍历首先想到的就是递归，然后想到的就是队列和栈来解决二叉树的非递归遍历
     * 序列化与反序列化就像对字符串的加密和解密一样
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        if(root == null) return "#,";
        str.append(root.val).append(",")
                .append(serialize(root.left))
                .append(serialize(root.right));
        return str.toString();
    }
    public TreeNode deserialize(String data) {
        Queue<String> queue = new ArrayDeque<>(Arrays.asList(data.split(",")));
        return deserialize(queue);
    }

    private TreeNode deserialize(Queue<String> queue) {
        String s = queue.poll();
        if ("#".equals(s)) return null;
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
        return root;
    }
}
