
import java.util.List;

/**
 * @author winter
 * @date 2019/11/28 21:36
 */
public class Solution {
    /**
     * 动态规划，自底向上的思想解决，状态转移方程为:
     * dp[i][j] = min(dp[i+1][j],dp[i+1][j+1])+dp[i][j]
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle.size() == 0) return triangle.get(0).get(0);

        for (int i = triangle.size() - 2; i >= 0; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)) + triangle.get(i).get(j);
                triangle.get(i).set(j, min);
            }
        }
        return triangle.get(0).get(0);

    }
}
