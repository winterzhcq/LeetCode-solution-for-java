
import java.util.Stack;

/**
 * @author winter
 * @date 2019/12/28 22:50
 */
public class Solution02 {
    /**
     * 单调栈解决，当单调递增的时候就往栈里放元素，当遇见上一个栈顶的元素比当前的值大的时候，
     * 就弹出栈顶元素，比较与当前元素的关系，求最大的面积
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] > heights[i]) {
                maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        return maxarea;
    }
}
