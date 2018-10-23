
/**
 * @author winter
 * @date 2018/10/23 17:37
 */
public class Solution1 {
    //一对一比较
    public ListNode mergeKLists(ListNode[] lists) {
        //记录下标
        int min_index = 0;
        //初始化头结点
        ListNode dummyHead = new ListNode(-1);
        ListNode h = dummyHead;
        //当所有节点都比较结束，结束当前循环
        while (true){
            boolean isOver = true;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < min) {
                        min_index = i;
                        min = lists[i].val;
                    }
                    isOver = false;
                }
            }
            if (isOver)
                break;
            ListNode temp = new ListNode(lists[min_index].val);
            h.next = temp;
            h = h.next;
            //最小的链表向后移动一个节点
            lists[min_index] = lists[min_index].next;
        }
        h.next = null;
        return dummyHead.next;
    }
}
