
/**
 * @author winter
 * @date 2019/8/5 22:48
 */

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public void flatten(TreeNode root) {
        while (root != null){
            // 如果左子树为空
            if(root.left == null)
                root = root.right;
            else {

                TreeNode pre = root.left;
                while (pre.right != null)
                    pre = pre.right;
                // 将右子树放在左子树的最右子节点下
                pre.right = root.right;
                // 将左子树变为右子树
                root.right = root.left;
                root.left = null;
                // 继续遍历
                root = root.right;
            }
        }
    }
}
