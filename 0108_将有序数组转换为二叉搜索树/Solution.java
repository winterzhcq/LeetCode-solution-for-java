
/**
 * @author winter
 * @date 2019/3/25 11:07
 */

 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;};
}
public class Solution {
    /**
     * 使用递归解决
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        //如果数组为空，直接返回null就行
        if (nums == null || nums.length == 0)
            return null;
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        //如果左子树大于右字数，递归的结束条件
        if (left > right)
            return null;
        if (left == right)
            return new TreeNode(nums[left]);
        //求每一次递归的根节点
        int mid = left + (right-left)/2;
        //先序遍历的思想
        TreeNode current = new TreeNode(nums[mid]);
        //递归左子树
        current.left = sortedArrayToBST(nums,left,mid-1);
        //递归右子树
        current.right = sortedArrayToBST(nums,mid+1,right);

        return current;
    }
}
