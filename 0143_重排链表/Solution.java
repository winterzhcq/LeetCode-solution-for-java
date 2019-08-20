
/**
 * @author winter
 * @date 2019/8/20 21:19
 */

 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        ListNode  slow = head,fast = head.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 反转链表
        ListNode right = resver(slow.next);
        slow.next = null;
        ListNode left = head;
        // 交叉插入反转的右链表
        while (right != null){
            ListNode next = right.next;
            right.next = left.next;
            left.next = right;
            right = next;
            left = left.next.next;
        }
    }

    private ListNode resver(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
