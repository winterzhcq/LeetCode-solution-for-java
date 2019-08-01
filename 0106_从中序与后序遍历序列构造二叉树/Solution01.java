

import java.util.HashMap;
import java.util.Map;

/**
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 使用Map
 * @author winter
 * @date 2019/7/29 22:42
 */


public class Solution01 {
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<Integer, Integer>();
        for (int i = 0; i <inorder.length ; i++) {
            map.put(inorder[i],i);
        }
        return helper(inorder.length - 1,0,inorder.length - 1,inorder,postorder);
    }

    private TreeNode helper(int preStart, int start, int end, int[] inorder, int[] postorder) {
        if (preStart < 0 || start > end)
            return null;
        TreeNode node = new TreeNode(postorder[preStart]);
        int inIndex = map.get(postorder[preStart]);
        node.right = helper(preStart-1,inIndex+1,end,inorder,postorder);
        node.left = helper(preStart-end+inIndex-1,start,inIndex-1,inorder,postorder);
        return node;
    }
}
