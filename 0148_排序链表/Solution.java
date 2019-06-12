

/**
 * @author winter
 * @date 2019/2/21 17:21
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    /**
     * 采用归并排序解决
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if (head == null)
            return null;
        return mergeSortList(head);
    }

    private ListNode mergeSortList(ListNode head) {
        if (head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while (fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l = mergeSortList(head);
        ListNode r = mergeSortList(slow);
        return meger(l,r);
    }

    // 归并两个链表
    private ListNode meger(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l != null && r != null){
            if (l.val < r.val){
                cur.next = l;
                cur = cur.next;
                l = l.next;
            }else {
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }
        // 归并结束如果左链表还有结点
        if (l != null)
            cur.next = l;
        // 归并结束如果右链表还有结点
        if (r != null)
            cur.next = r;
        return dummyHead.next;
    }

}
