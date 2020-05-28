
import java.util.List;

public class Solution02 {

    int height = 0;
    int[][] memo;
    /**
     * 使用自顶向下的暴力递归求解，很容易理解
     * 解决重复计算使用记忆化搜索
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle == null || triangle.size() == 0) return 0;

        height = triangle.size();
        memo = new int[height][height];

        return helper(0, 0, triangle);
    }

    private int helper(int level, int elementIndex, List<List<Integer>> triangle) {

        if (level == height - 1) return triangle.get(level).get(elementIndex);

        if (memo[level][elementIndex] != 0) return memo[level][elementIndex];

        int left = helper(level + 1, elementIndex, triangle);
        int right = helper(level + 1, elementIndex + 1, triangle);

        memo[level][elementIndex] = Math.min(left, right) + triangle.get(level).get(elementIndex);

        return memo[level][elementIndex];
    }
}
