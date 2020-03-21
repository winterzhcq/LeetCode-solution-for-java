/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return null;
        inOrder(root,list);
        return buildTree(list,0,list.size()-1);
    }
    private void inOrder(TreeNode node,List<Integer> list){
        if(node == null) return ;
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }
    private TreeNode buildTree(List<Integer> list,int left,int right){
        if(left > right) return null;
        int mid = left + (right - left >> 1);
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildTree( list, left, mid-1);
        root.right = buildTree( list, mid+1, right);
        return root;
    }
}