
import java.util.List;

public class Solution04 {

    /**
     * 使用自低向上的dp去解决该问题，有了前面递归的铺垫，我们先找到状态转移方程
     * 将二维数组优化成一维数组
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle == null || triangle.size() == 0) return 0;

        int height = triangle.size();
        int[] dp = new int[height];

        // dp过程
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }

        return dp[0];
    }
}
