
import java.util.ArrayList;
import java.util.List;

/**
 * 递归解决
 * @author winter
 * @date 2019/8/12 20:00
 */
public class Solution01 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        if (root.left != null)
            postorderTraversal(root.left);
        if (root.right != null)
            postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }
}
