

import java.util.Stack;

public class Solution {
    /**
     * 解题思路
     * 维护一个单调栈，从左到右遍历数组。
     *
     * 如果当前元素比队尾元素小，下来判断剩余数组长度（len - i）和目标栈还需要元素个数（k - stack.size()）大小。
     *      1.1 如果前者小于或等于后者，则说明不能再出栈了，否则剩余数组全加进栈也不够将栈填到k+1长度。
     *      （需要k+1而不是k是因为一开始就填进了-1，但这个-1是不会被返回的）
     *      1.2 如果前者大于后者，就将队尾元素出栈，并重复第一步
     *
     * 如果栈长度不够，不用判断，直接将当前元素进栈即可。
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] mostCompetitive(int[] nums, int k) {

        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] < stack.peek() && k - stack.size() < nums.length - i) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }

        int[] rst = new int[k];
        while (k > 0) {
            rst[--k] = stack.pop();
        }

        return rst;
    }
}
