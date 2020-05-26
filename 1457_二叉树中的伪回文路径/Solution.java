/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   int count = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        getPath(root, list);
        return count;
    }

    public void getPath(TreeNode root, List<Integer> list) {
        if (root.left == null && root.right == null) {
            Map<Integer, Integer> map = new HashMap<>();
            list.stream().forEach(a -> {
                if (map.containsKey(a)) map.remove(a);
                else map.put(a, a);
            });
            if (map.size() <= 1) count++;
            return;
        }
        if (root.left != null) {
            list.add(root.left.val);
            getPath(root.left, list);
            list.remove(list.size()-1);
        }

        if (root.right != null) {
            list.add(root.right.val);
            getPath(root.right, list);
            list.remove(list.size()-1);
        }
    }
}