
import java.util.LinkedList;

/**
 * 借助栈迭代，类似于树的层次遍历
 * @author winter
 * @date 2019/7/12 20:37
 */
public class Solution01 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        LinkedList<TreeNode> node_stack = new LinkedList();
        LinkedList<Integer> sum_stack = new LinkedList();
        node_stack.add(root);
        sum_stack.add(sum - root.val);
        while (!node_stack.isEmpty()){
            TreeNode node = node_stack.poll();
            Integer cur_sum = sum_stack.poll();
            if (node.left == null && node.right == null && cur_sum == 0)
                return true;
            if (node.left != null) {
                node_stack.add(node.left);
                sum_stack.add(cur_sum - node.left.val);
            }
            if (node.right != null){
                node_stack.add(node.right);
                sum_stack.add(cur_sum - node.right.val);
            }
        }
        return false;
    }
}
