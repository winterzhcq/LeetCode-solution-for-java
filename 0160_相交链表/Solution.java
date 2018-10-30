import java.util.HashSet;

/**
 * @author winter
 * @date 2018/10/30 20:29
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class Solution {
    /*
    * 疑问该链表没有重复的么？
    * */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        HashSet<Integer> set = new HashSet<>();
        while (headA != null){
            set.add(headA.val);
            headA = headA.next;
        }
        while (headB != null){
            if (set.contains(headB.val))
                return headB;
            headB = headB.next;
        }
        return null;
    }
}
