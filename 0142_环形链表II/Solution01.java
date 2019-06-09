

/**
 * @author winter
 * @date 2019/6/9 19:24
 */
public class Solution01 {
        public ListNode detectCycle(ListNode head) {
            if (head == null)
                return null;
            ListNode fast = head;
            ListNode slow = head;
            //利用快慢指针判断是否有环
            while (fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
                //如果有环，利用快快指针是慢指针走的2倍的的思想，
                //让快指针初始化为head节点，保证下一次相遇刚好在环节点上
                if (fast == slow) {
                    fast = head;
                    while (fast != slow){
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return fast;
                }
            }
            return null;
        }
}
