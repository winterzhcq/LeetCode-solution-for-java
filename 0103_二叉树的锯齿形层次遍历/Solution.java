

import java.util.*;

/**
 * @author winter
 * @date 2019/7/23 21:38
 */
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null)
            return lists;
        Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         // 记录数的深度
        int depth = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size ; i++) {
                TreeNode temp = queue.poll();
                if (depth % 2 == 0)
                    list.add(temp.val);
                else list.add(0,temp.val);
                if (temp.left != null)
                     queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            lists.add(list);
            depth++;
        }
        return lists;
    }
}
