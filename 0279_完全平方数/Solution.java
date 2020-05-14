
public class Solution {
    /**
     * 递归问题 => 重叠子问题最优子结构 =>记忆化搜索（自顶向下的解决问题）=>动态规划（自底向上的解决问题）
     * dynamic programming
     * 初始条件 dp[i] = i;
     * 状态转移方程 dp[n] = min(dp[i],dp[i-j*j])
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1;i<=n;i++){
            dp[i]=i;
            for(int j = 1 ;i-j*j>=0;i++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
