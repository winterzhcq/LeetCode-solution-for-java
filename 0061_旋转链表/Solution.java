class Solution {
     public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int size = getSize(head);
         k = k%size;
         k = size - k;
         ListNode kNode = head;
         while (k>1){
             kNode = kNode.next;
             k--;
         }
         ListNode lastNode = kNode;
         while (lastNode.next != null){
             lastNode = lastNode.next;
         }
         lastNode.next = head;
         ListNode newNode = kNode.next;
         kNode.next = null;
         return newNode;
    }
    private int getSize(ListNode head){
        ListNode p = head;
        int size = 1;
        while (p.next != null){
            p = p.next;
            size++;
        }
        return size;
    }
}