class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummHead = new ListNode(-1);
        dummHead.next = head;
        ListNode preNode = dummHead;
        ListNode cur = preNode.next;
	//�ֶ���ͼ���
        while (head.next != null){ 
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = preNode.next;
            preNode.next = temp;
        }
        return dummHead.next;
    }
}