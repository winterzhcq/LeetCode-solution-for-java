
/**
 * @author winter
 * @date 2019/12/28 21:19
 */
public class Solution01 {
    /**
     * 采用分冶的思想，可以采用线段树的思想去解决，求解每一个区间的
     * 的最大面积，然后再比较
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        return calculateArea(heights, 0, heights.length - 1);
    }

    public int calculateArea(int[] heights, int start, int end) {
        if (start > end)
            return 0;
        int minindex = start;
        for (int i = start; i <= end; i++)
            if (heights[minindex] > heights[i])
                minindex = i;
        return Math.max(heights[minindex] * (end - start + 1), Math.max(calculateArea(heights, start, minindex - 1), calculateArea(heights, minindex + 1, end)));
    }
}
