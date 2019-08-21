
/**
 * @author winter
 * @date 2019/8/21 20:49
 */
 //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return head;
        // 将插入排序的值放入新链表
        ListNode dummyhead = new ListNode(-1);
        ListNode cur = head;
        ListNode pre = dummyhead;
        ListNode next = null;
        while (cur != null){
            next = cur.next;
            while (pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            // 截断初始链表
            cur.next = pre.next;
            pre.next = cur;
            pre = dummyhead;
            cur = next;
        }
        return dummyhead.next;
    }
}
