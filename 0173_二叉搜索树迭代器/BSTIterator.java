
import java.util.Stack;

/**
 * @author winter
 * @date 2019/10/14 22:25
 */

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        putAll(root);
    }


    /** @return the next smallest number */
    public int next() {
        final TreeNode pop = stack.pop();
        putAll(pop.right);
        return pop.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty();
    }
    private void putAll(TreeNode node) {
        for(;node != null;stack.push(node),node = node.left);
    }
}
