
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author winter
 * @date 2019/3/8 22:59
 */

public class Solution01 {
    /**
     *    1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     * 使用队列迭代
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null ^ t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
