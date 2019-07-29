
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,preorder.length - 1,preorder,inorder);
    }

    private TreeNode helper(int preStart, int start, int end, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || start > end)
            return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        int inIndex = 0; // Index of current root in inorder
        for (int i = start; i <= end; i++) {
            if (inorder[i] == preorder[preStart])
                inIndex = i;
        }
        node.left = helper(preStart+1,start,inIndex - 1,preorder,inorder);
        node.right = helper(preStart+inIndex-start+1,inIndex+1,end,preorder,inorder);
        return node;
    }
}
