public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode cur = headA;
        int lenA = 0;
        while(cur != null){
            lenA ++;
            cur = cur.next;
        }

        cur = headB;
        int lenB = 0;
        while(cur != null){
            lenB ++;
            cur = cur.next;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        if(lenA > lenB) {
            for(int i=0; i<lenA-lenB; i++){
                curA = curA.next;
            }
        }
        if(lenA < lenB)  {
            for(int i=0; i<lenB-lenA; i++){
                curB = curB.next;
            }
        }
        while(curA!=null){
            if(curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
        
    }
}