

import java.util.Set;
import java.util.TreeSet;

/**
 * @author winter
 * @date 2019/8/13 20:10
 */

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    Set<Integer> set = new TreeSet<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true;
        set.add(root.val);
        if (root.left != null)
            isUnivalTree(root.left);
        if (root.right != null)
            isUnivalTree(root.right);
        return set.size() == 1;
    }
}
