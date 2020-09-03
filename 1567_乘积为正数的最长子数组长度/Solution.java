package cn.winter.leetcode.q1567;

public class Solution {
    /**
     * dp动态规划的思想
     *
     * nums[i] 要么是正数，要么是负数
     *
     * dp[i][0] 以 i 结尾的乘积为正数的最长子数组长度
     *
     * dp[i][1] 以 i 结尾的乘积为负数的最长子数组长度
     *
     * @param nums
     * @return
     */
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][2];
        int res = 0;
        if (nums[0] > 0) dp[0][0] = 1;
        else if (nums[0] < 0) dp[0][1] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                dp[i][0] = dp[i - 1][0] + 1;
                if (dp[i - 1][1] > 0) dp[i][1] = dp[i - 1][1] + 1;
            } else if (nums[i] < 0) {
                if (dp[i - 1][1] > 0) dp[i][0] = dp[i - 1][1] + 1;
                dp[i][1] = dp[i-1][0] + 1;
            }
        }
        for (int i = 0; i < n; i++) res = Math.max(res, dp[i][0]);
        return res;
    }
}
