package cn.winter.leetcode.q21;

/**
 * @author winter
 * @date 2018/10/28 21:59
 */


class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
       while (l1 != null && l2 != null){
           if (l1.val < l2.val){
               cur.next = l1;
               cur = cur.next;
               l1 = l1.next;
           }else {
               cur.next = l2;
               cur = cur.next;
               l2 = l2.next;
           }
       }
       if (l1 == null)
           cur.next = l2;
       if (l2 == null)
           cur.next = l1;
       return dummyHead.next;
    }
}
