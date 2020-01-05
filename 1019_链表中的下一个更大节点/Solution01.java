
import java.util.*;

/**
 * @author winter
 * @date 2019/12/22 21:18
 */


public class Solution01 {
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) return null;
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>((a, b) -> b - a);
        int length = 0;
        while (head != null) {
            list.add(length,head.val);
            while (!stack.isEmpty() && head.val > list.get(stack.peek())) {
                map.put(stack.pop(), head.val);
            }
            stack.push(length);
            length++;
            head = head.next;
        }
        int[] result = new int[length];
        map.forEach((k, v) -> result[k] = v);
        return result;
    }
}
