

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author winter
 * @date 2019/7/23 21:38
 */


public class Solution01 {
    // DFS
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
         zigzagLevelOrder(lists,root,0);
         return lists;
    }

    private void zigzagLevelOrder(List<List<Integer>> lists, TreeNode node, int depth) {
        if (node == null)
            return ;
        if (lists.size() <= depth){
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }
        List<Integer> temp = lists.get(depth);
        if (depth % 2 == 0)
            temp.add(node.val);
        else temp.add(0,node.val);
        zigzagLevelOrder(lists,node.left,depth+1);
        zigzagLevelOrder(lists,node,depth+1);
    }
}
