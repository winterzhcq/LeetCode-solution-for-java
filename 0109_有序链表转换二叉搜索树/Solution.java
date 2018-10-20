
/**
 * @author winter
 * @date 2018/10/20 17:50
 */

 //Definition for singly-linked list.
 class ListNode {
   int val;
    ListNode next;
   ListNode(int x) { val = x; }
 }

 //Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       return sortedListToBST(head,null);
    }
    private TreeNode sortedListToBST(ListNode start, ListNode end) {
        //如果为空直接返回
        if (start == end)
            return null;
        //如果只有一个节点，创建二分搜索树，返回根节点
        if (start.next == null)
            return new TreeNode(start.val);
        //使用快慢指针找到链表的中间节点
        ListNode fast = start;
        ListNode slow = start;
        while (fast != end && fast.next != end){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        //递归创建左子树
        root.left =  sortedListToBST(start,slow);
        //递归创建右子树
        root.right = sortedListToBST(slow.next,end);
        //返回二分搜索树的根节点
        return root;
    }
}
