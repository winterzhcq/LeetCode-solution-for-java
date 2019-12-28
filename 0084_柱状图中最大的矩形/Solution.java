
/**
 * @author winter
 * @date 2019/12/28 21:04
 */
public class Solution {
    /**
     * 求一个区间的最大最小面积，最先想到的是
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        int maxarea = 0;
        for (int i = 0; i < heights.length ; i++) {
            int minHeight = Integer.MIN_VALUE;
            for (int j = 1; j < heights.length ; j++) {
                minHeight = Math.min(minHeight,heights[i]);
                maxarea = Math.max(maxarea,(j-i+1)*minHeight);
            }
        }
        return maxarea;
    }
}
