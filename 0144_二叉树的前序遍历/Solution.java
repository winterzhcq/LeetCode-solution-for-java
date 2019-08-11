


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author winter
 * @date 2019/8/11 23:19
 */

  //Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if (temp.right != null)
                stack.add(temp.right);
            if (temp.left != null)
                stack.add(temp.left);
        }
        return list;
    }
}
