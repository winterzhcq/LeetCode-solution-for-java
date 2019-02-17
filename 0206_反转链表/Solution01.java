
/**
 * @author winter
 * @date 2019/2/17 10:04
 */
/*class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}*/
class Solution01 {
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;   // 下一个节点

        while (cur != null) {
            // 拿到原来链表head的下一个节点
            next = cur.next;
            // 把当前链表的下一个节点指向上一个节点也就是pre
            cur.next = pre;
            // 重置pre为当前链表节点
            pre = cur;
            // 重置当前节点
            cur = next;
        }
        // 返回反转后的链表 也就是pre 其实就是cur
        return pre;
    }
}