
/**
 * @author winter
 * @date 2018/10/21 13:48
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
public class Solution {
    //使用递归解决
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
       int left_hight =  maxDepth(root.left);
       int right_hight = maxDepth(root.right);
       return Math.max(left_hight,right_hight);
    }
}
