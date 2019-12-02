

/**
 * @author winter
 * @date 2019/12/2 20:29
 */
public class Solution {
    /**
     * 最短距离是两个点的横纵坐标的绝对值的最大值
     * @param points
     * @return
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length-1; i++) {
            int x = points[i+1][0] - points[i][0];
            int y = points[i+1][1] - points[i][1];
            sum += Math.max(Math.abs(x),Math.abs(y));
        }
        return sum;
    }
}
