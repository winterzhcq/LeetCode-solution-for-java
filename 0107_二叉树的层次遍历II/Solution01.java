

import java.util.ArrayList;
import java.util.List;

/**
 * DFS
 * @author winter
 * @date 2019/8/1 20:52
 */
public class Solution01 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null)
            return lists;
        helper(lists,root,0);
        return lists;
    }

    private void helper(List<List<Integer>> lists, TreeNode node, int level) {
        if (node == null)
            return;
        if (level >= lists.size())
            lists.add(0,new ArrayList<Integer>());
        helper(lists,node.left,level+1);
        helper(lists,node.right,level+1);
        lists.get(lists.size()-level-1).add(node.val);
    }
}
