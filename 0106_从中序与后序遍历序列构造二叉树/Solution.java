

/**
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * @author winter
 * @date 2019/7/29 22:42
 */

  //Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder.length - 1,0,inorder.length - 1,inorder,postorder);
    }

    private TreeNode helper(int preStart, int start, int end, int[] inorder, int[] postorder) {
        if (preStart < 0 || start > end)
            return null;
        TreeNode node = new TreeNode(postorder[preStart]);
        int inIndex = 0; // Index of current root in inorder
        for (int i = start; i <= end; i++) {
            if (inorder[i] == postorder[preStart])
                inIndex = i;
        }
        node.right = helper(preStart - 1,inIndex+1,end,inorder,postorder);
        // 找到左节点
        node.left = helper(preStart-end +inIndex-1,start,inIndex - 1,inorder,postorder);
        return node;
    }
}
