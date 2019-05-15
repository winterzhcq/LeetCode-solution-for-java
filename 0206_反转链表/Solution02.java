
/**
 * @author winter
 * @date 2019/5/14 21:44
 */
public class Solution02 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
