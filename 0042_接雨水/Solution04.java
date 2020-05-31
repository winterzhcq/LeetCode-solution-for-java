
public class Solution04 {
    /**
     * 状态转移方程：dp[i] = max(dp[i-1] + nums[i], nums[i])，
     * 其中dp[i]表示以索引i为结束点基准的子数组的最大值
     * 转移方程： 若 dp[i−1]≤0 ，说明 dp[i - 1]对 dp[i]产生负贡献，
     * 即 dp[i-1] + nums[i] 还不如 nums[i] 本身大
     *
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];

        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = Math.max(dp[i], res);
        }

        return res;
    }
}
