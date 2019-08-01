

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BFS 借助队列使用广度优先队列实现
 * @author winter
 * @date 2019/8/1 20:31
 */

 //Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null)
            return lists;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();;
            for (int i = 0; i < size ; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            lists.add(0,list);
        }
        return lists;
    }
}
