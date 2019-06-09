

import java.util.HashSet;
import java.util.Set;

/**
 * @author winter
 * @date 2019/6/9 18:43
 */

 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
