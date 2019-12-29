
import java.util.Stack;

/**
 * @author winter
 * @date 2019/12/29 23:03
 */
public class Solution01 {
    /**
     * 使用单调栈解决，将没一列转换成矩形的高度就行，就可以转换成84题的方式解决
     * @param matrix
     * @return
     */
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int maxarea = 0;
        int row = matrix.length;
        int col = row == 0 ? 0:matrix[0].length;
        int[] dp = new int[col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                dp[j] = matrix[i][j] == '1' ? dp[j]+1 : 0;
            }
            maxarea = Math.max(maxarea,helper(dp));
        }
        return maxarea;
    }

    private int helper(int[] heights) {
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
