
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author winter
 * @date 2019/10/15 22:31
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val = x;
    }
}
public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
             int size = queue.size();
             for (int i= 0; i < size;i++){
                  TreeNode temp = queue.poll();
                  if (temp.left != null)
                      queue.add(temp.left);
                  if (temp.right != null)
                       queue.add(temp.right);
                  if (i == size -1)
                      list.add(temp.val);
             }
        }
        return list;
    }
}
