
import java.util.Stack;

/**
 * @author winter
 * @date 2019/8/19 20:44
 */

 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1
        Stack<ListNode> stack1 = new Stack<>();
        // l2
        Stack<ListNode> stack2 = new Stack<>();
        while (l1 != null){
            stack1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null){
            stack2.push(l2);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode next = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if (!stack1.isEmpty()) sum += stack1.pop().val;
            if (!stack2.isEmpty()) sum += stack2.pop().val;
            next.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = next;
            next = head;
            sum = sum / 10;
        }
        return next.val == 0 ? next.next : next;
    }
}
