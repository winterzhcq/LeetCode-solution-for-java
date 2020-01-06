/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head == null) return 0;
        int ans = 0;
        while(head != null){
            ans = (ans << 1) + head.val;
            head = head.next;
        }
        return ans;
    }
}