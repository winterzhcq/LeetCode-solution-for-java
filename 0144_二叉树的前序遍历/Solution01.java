

import java.util.LinkedList;
import java.util.List;

/**
 * @author winter
 * @date 2019/8/11 23:36
 */
public class Solution01 {
    List<Integer> list = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return list;
        list.add(root.val);
        if (root.left != null)
            preorderTraversal(root.left);
        if (root.right != null)
            preorderTraversal(root.right);
        return list;
    }
}
