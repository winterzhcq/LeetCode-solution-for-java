class Solution {
	//���� 1->2->3->4, ��Ӧ�÷��� 2->1->4->3.
    public ListNode swapPairs(ListNode head) {
		// ����ͷ���
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
			// start = 3
            ListNode start = temp.next;
			// end = 4
            ListNode end = temp.next.next;
			//��1->4 
            temp.next = end;
			// 4-> 3.next
            start.next = end.next;
			// 3-> 4
            end.next = start;
			// ��һ��Ҫ��ת�ڵ��ǰһ���ڵ�
            temp = start;
        }
        return pre.next;
    }
}
