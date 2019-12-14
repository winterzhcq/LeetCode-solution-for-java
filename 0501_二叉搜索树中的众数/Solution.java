
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/12/14 22:08
 */

 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    Integer prev = null;
    int count = 1;
    int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        helper(list,root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
        return res;
    }

    private void helper(List<Integer> list, TreeNode root) {
        if (root == null) return;
        helper(list,root.left);
        if (prev != null){
            if (root.val == prev)
                count++;
            else count=1;
        }
        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }
        prev = root.val;
        helper( list,root.right);
    }
}
