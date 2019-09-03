import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/9/3 23:24
 */
public class Solution01 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        // 巧妙的写法
        for(int i = 0, j = list.size()-1; i<j;){
            if (list.get(i)+list.get(j) == k) return true;
            if (list.get(i) + list.get(j) < k) i++;
            else j--;
        }
        return false;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
