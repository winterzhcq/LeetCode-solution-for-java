/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if (root == null)
            return list;

        if (root.left != null)
        inorderTraversal(root.left);
        list.add(root.val);
        if (root.right != null)
        inorderTraversal(root.right);
        return list;
    }
}