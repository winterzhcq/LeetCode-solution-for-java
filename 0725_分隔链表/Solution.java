
/**
 * @author winter
 * @date 2019/10/22 21:46
 */

 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] listNodes = new ListNode[k];
        int length = 0;
        ListNode temp = root;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        int n = length / k,  r = length % k;
        ListNode node = root, prev = null;
        for (int i = 0; node != null && i < k ; i++,r--) {
            listNodes[i] = node;
            for (int j = 0; j < n+(r>0?1:0) ; j++) {
                prev = node;
                node = node.next;
            }
            prev.next = null;
        }
        return listNodes;
    }
}
