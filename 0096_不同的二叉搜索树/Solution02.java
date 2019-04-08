
/**
 * @author winter
 * @date 2019/4/8 14:39
 */
public class Solution02 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        //使用动态规划的思想，最外面的循环是求当有几个节点的时候会出现多少种情况，没多一个节点会依赖先前的节点数
        for (int i = 2; i <= n ; i++) {
            //当使用j作为顶点的时候
            for (int j = 1; j <= i ; j++) {
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
