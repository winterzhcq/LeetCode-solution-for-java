
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author winter
 * @date 2019/12/22 21:18
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        Stack<Integer> stack = new Stack<>();
        int len = arrayList.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int num = arrayList.get(i);
            while (stack.size() > 0 && arrayList.get(stack.peek()) < num) {
                Integer popIndex = stack.pop();
                res[popIndex] = num;
            }
            stack.push(i);
        }
        return res;
    }
}
