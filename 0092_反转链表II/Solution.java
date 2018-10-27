/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null)
            return head;
        ListNode dummhead = new ListNode(-1);
        dummhead.next = head;
        ListNode preNode = dummhead;
        for (int i = 0; i < m -1; i++) {
            preNode = preNode.next;
        }
        //反转区间的头结点
        ListNode cur = preNode.next;
        for (int i = 0; i < n-m ; i++) {
            ListNode temp = cur.next;//思路：采用头插法，不断地把要反转的节点插到反转区间头节点的前面。重点就是记录第m个结点的前驱结点和第n个结点的后续结点。
            cur.next = temp.next;
            temp.next = preNode.next;
            preNode.next = temp;
            // 经过以上步骤变成了1->3->2->4->5
            // 再经过一次最后变成了1->4->3->2->5
        }
        return dummhead.next;
    }
}