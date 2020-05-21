
import java.util.Arrays;

public class Solution {
    /**
     * 动态规划，求解最长子序列的方式
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        int[] memo = new int[intervals.length];
        Arrays.fill(memo, 1);

        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[i][0] >= intervals[j][1]) {
                    memo[i] = Math.max(memo[i], 1 + memo[j]);
                }
            }
        }

        return intervals.length - Arrays.stream(memo).max().getAsInt();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.eraseOverlapIntervals(new int[][]{{1,2},{2,3}}));
    }
}
