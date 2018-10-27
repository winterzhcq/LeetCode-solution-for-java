package cn.winter.leetcode.q23;

/**
 * @author winter
 * @date 2018/10/27 18:09
 */
public class Solution4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode ans=h;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                h.next = l1;
                h = h.next;
                l1 = l1.next;
            } else {
                h.next = l2;
                h = h.next;
                l2 = l2.next;
            }
        }
        if(l1==null){
            h.next=l2;
        }
        if(l2==null){
            h.next=l1;
        }
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
       if (lists == null || lists.length == 0)
           return null;
        int interval = 1;
        //分治的另外一种实现
        while (interval<lists.length){
            for (int i = 0; i+interval < lists.length; i=i+interval*2) {
                lists[i] = mergeTwoLists(lists[i],lists[i+interval]);
            }
            interval *= 2;
        }
        return lists[0];
    }
}
