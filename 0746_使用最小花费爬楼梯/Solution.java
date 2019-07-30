

/**
 * 动态规划
 * @author winter
 * @date 2019/7/30 19:53
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = 0; i <= cost.length - 1; i++) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
