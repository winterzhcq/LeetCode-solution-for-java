import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author winter
 * @date 2018/10/23 15:53
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //遍历存储在list中
        List<Integer> list = new ArrayList<>();
        for (ListNode ln : lists) {
            while (ln != null){
                list.add(ln.val);
                ln = ln.next;
            }
        }
        //对list从小到大排序
        Collections.sort(list);
        ListNode dummyHead = new ListNode(-1);
        ListNode h = dummyHead;
        for(int i : list){
            ListNode listNode = new ListNode(i);
            h.next = listNode;
            h = h.next;
        }
        h.next = null;
        return dummyHead.next;
    }
}
