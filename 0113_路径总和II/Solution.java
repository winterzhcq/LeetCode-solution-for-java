


import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/7/12 20:56
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null)
            return lists;
        helper(root, sum, lists, new ArrayList<Integer>());
        return lists;
    }

    private void helper(TreeNode root, int sum, List<List<Integer>> lists, ArrayList<Integer> temp) {
        if (root == null)
            return;
        temp.add(root.val);
        if (root.left == null && root.right == null && sum - root.val == 0) lists.add(new ArrayList<>(temp));
        helper(root.left,sum - root.val,lists,temp);
        helper(root.right,sum - root.val,lists,temp);
        // 回溯
        temp.remove(temp.size() - 1);
    }
}
