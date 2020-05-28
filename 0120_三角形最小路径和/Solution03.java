
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

public class Solution03 {

    /**
     * 使用自低向上的dp去解决该问题，有了前面递归的铺垫，我们先找到状态转移方程
     * dp[i][j] = min(dp[i+1][j],dp[i+1][j+1])+dp[i][j]
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle == null || triangle.size() == 0) return 0;

        int height = triangle.size();
        int[][] dp = new int[height][triangle.get(height - 1).size()];

        //初始化
        for (int i = 0; i < triangle.get(height - 1).size(); i++) {
            dp[height - 1][i] = triangle.get(height - 1).get(i);
        }

        // dp过程
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }

        return dp[0][0];
    }
}
