
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 迭代
 * @author winter
 * @date 2019/8/12 19:46
 */

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return result;
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            result.add(0,temp.val);
            if (temp.left != null)
                stack.add(temp.left);
            if (temp.right != null)
                stack.add(temp.right);
        }
        return result;
    }
}
