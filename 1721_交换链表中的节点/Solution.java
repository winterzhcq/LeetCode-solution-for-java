
import java.util.List;

// Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        int count = 1;
        while (cur.next != null){
            if (count < k){
                fast = fast.next;
            }else {
                slow = slow.next;
            }
            count++;
            cur = cur.next;
        }
        // 交换正数第k个节点和倒数第k个节点的值
        count = fast.val;
        fast.val = slow.val;
        slow.val = count;
        return head;
    }

}
