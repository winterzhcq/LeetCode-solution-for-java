
import java.util.LinkedList;
import java.util.List;

/**
 * @author winter
 * @date 2019/10/17 22:46
 */

 //Definition for a binary tree node.
  class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        construct_paths(root, "", paths);
        return paths;
    }

    private void construct_paths(TreeNode root, String path, LinkedList<String> paths) {
        if (root != null) {
            path += Integer.toString(root.val);
            if ((root.left == null) && (root.right == null))
                paths.add(path);
            else {
                path += "->";
                construct_paths(root.left, path, paths);
                construct_paths(root.right, path, paths);
            }
        }
    }
}
