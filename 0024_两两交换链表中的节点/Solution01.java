class Solution {
	//给定 1->2->3->4, 你应该返回 2->1->4->3.
    public ListNode swapPairs(ListNode head) {
		// 虚拟头结点
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
			// start = 3
            ListNode start = temp.next;
			// end = 4
            ListNode end = temp.next.next;
			//把1->4 
            temp.next = end;
			// 4-> 3.next
            start.next = end.next;
			// 3-> 4
            end.next = start;
			// 下一个要反转节点的前一个节点
            temp = start;
        }
        return pre.next;
    }
}
