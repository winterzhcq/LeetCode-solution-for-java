public class Solution {
   //两个链表解决，一个先遍历n个节点
   public ListNode removeNthFromEnd(ListNode head, int n) {
         if (head == null || n <0)
            return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode frist = dummyHead;
        ListNode last = dummyHead;
        for (int i = 0; i < n ; i++) {
            frist = frist.next;
        }
        while (frist.next != null){
            frist = frist.next;
            last = last.next;
        }
        last.next = last.next.next;
        return dummyHead.next;
    }
}