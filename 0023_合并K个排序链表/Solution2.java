import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author winter
 * @date 2018/10/23 22:05
 */
public class Solution2 {
    //使用优先队列实现
    public ListNode mergeKLists(ListNode[] lists) {
        //实现一个比较器
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        };
        //使用优先队列，将最小的放在栈顶
        Queue<ListNode> queue = new PriorityQueue<>(comparator);
        for (ListNode ln : lists){
            if (ln != null)
                queue.add(ln);
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode h = dummyHead;
       while (!queue.isEmpty()){
           h.next = queue.poll();
           h = h.next;
           ListNode node = h.next;
           if (node != null)//将弹出来的链表压栈
               queue.add(node);
       }
       return dummyHead.next;
    }
}
