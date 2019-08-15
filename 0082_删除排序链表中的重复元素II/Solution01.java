
/**
 * @author winter
 * @date 2019/8/15 21:35
 */
public class Solution01 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null )
            return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        while (cur != null){
            // 走到最后一个重复节点
            while (cur.next != null && cur.val == cur.next.val)
                cur = cur.next;
            // 没有重复节点
            if (pre.next == cur)
                pre = pre.next;
            else {
                // 跳到重复节点的下一个节点
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
