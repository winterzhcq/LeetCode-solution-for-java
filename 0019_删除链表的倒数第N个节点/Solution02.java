
/**
 * @author winter
 * @date 2019/5/15 14:34
 */
public class Solution01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0)
            return null;
        ListNode dummHead = new ListNode(-1);
        dummHead.next = head;
        ListNode frist = dummHead;
        ListNode second = dummHead;
        for (int i = 0; i < n; i++) {
            frist = frist.next;
        }
        while (frist.next != null){
            frist = frist.next;
            second = second.next;
        }
        //记录要删除的节点
        ListNode temp = second.next;
        second.next = second.next.next;
        //删除不需要的节点
        temp.next = null;
        return dummHead.next;
    }
}
