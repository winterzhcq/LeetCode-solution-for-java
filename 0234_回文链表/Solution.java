
/**
 * @author winter
 * @date 2019/8/22 23:08
 */

 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head,fast = head.next,pre = null,prepre = null;
        // 反转链表的左半部分
        while (fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        ListNode right = slow.next;
        slow.next = pre;
        // 判断链表是奇数还是偶数
        ListNode left = fast == null ? slow.next : slow;
        // 比较反转的左链表和正常的右链表
        while (left != null){
            if (left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}