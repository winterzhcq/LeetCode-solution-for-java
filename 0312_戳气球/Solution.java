
public class Solution {
    /**
     * 使用动态规划去分析
     * @param nums
     * @return
     */
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int length = nums.length;

        int[] helpnums = new int[length + 2];
        helpnums[0] = helpnums[length + 1] = 1;
        for (int i = 0; i < nums.length; i++) {
            helpnums[i + 1] = nums[i];
        }

        int[][] dp = new int[length + 2][length + 2];
        for (int i = length; i >= 0; i--) {
            // j 应该从左往右
            for (int j = i + 1; j < length + 2; j++) {
                // 最后戳破的气球是哪个？
                for (int k = i + 1; k < j; k++) {
                    // 择优做选择
                    dp[i][j] = Math.max(
                            dp[i][j],
                            dp[i][k] + dp[k][j] + helpnums[i] * helpnums[j] * helpnums[k]
                    );
                }
            }
        }
        return dp[0][length + 1];
    }
}
