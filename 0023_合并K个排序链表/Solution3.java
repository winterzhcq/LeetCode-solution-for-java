package cn.winter.leetcode.q23;

/**
 * @author winter
 * @date 2018/10/27 17:12
 */
public class Solution3 {
    public ListNode mergeKList(ListNode[] listNodes){
        return partition(listNodes,0,listNodes.length-1);
    }
    /*
    * 将数组划分成最小单元，然后在合并回去
    * */
    public ListNode partition(ListNode[] listNode,int l,int r){
        if (l == r)
            return listNode[l];
        if (l<r) {
            int mid = (r - l) / 2 + l;
            //左划分
            ListNode left = partition(listNode, l, mid);
            //右划分
            ListNode right = partition(listNode, mid + 1, r);
            //合并左右划分
            return mergeTwoLists(left, right);
        }
       return null;
    }
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
        if (l1 == null){
            cur.next = l2;
        }
        if (l2 == null){
            cur.next = l1;
        }
        return dummyHead.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        //如果链表数组为空，直接返回
        if(lists == null)
            return null;
        //如果链表数组的长度为1，直接返回该链表
        if(lists.length == 1)
            return lists[0];
        //采用分治的方法解决
        return  mergeKList(lists);
    }
}
