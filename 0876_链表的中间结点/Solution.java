
/**
 * @author winter
 * @date 2019/5/15 14:13
 */


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


public class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
