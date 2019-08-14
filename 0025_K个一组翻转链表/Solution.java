
/**
 * @author winter
 * @date 2019/8/14 20:32
 */

  //Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if( head == null || head.next == null || k == 0)
            return head;
        // 虚拟头结点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode end = dummyHead;
        while (end.next != null){
            for (int i = 0; i < k && end != null ; i++) {
                end = end.next;
            }
            if (end == null)
                break;
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            ListNode temp = reverse(start);
            pre.next = temp;
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummyHead.next;
    }

    /**
     * 反转链表，由于上面已经对null进行了判断，这里可以不做判断
     * @param start
     * @return
     */
    private ListNode reverse(ListNode start) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = start;
        ListNode pre = dummyHead;
        ListNode cur = start;
        while (cur.next != null){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummyHead.next;
    }
}
