
import java.util.List;

public class Solution01 {

    int height = 0;

    /**
     * 使用自顶向下的暴力求解，很容易理解
     * 问题：存在重复的计算
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        height = triangle.size();
        return helper(0, 0, triangle);
    }

    private int helper(int level, int elementIndex, List<List<Integer>> triangle) {

        if (level == height - 1) return triangle.get(level).get(elementIndex);

        int left = helper(level + 1, elementIndex, triangle);
        int right = helper(level + 1, elementIndex + 1, triangle);

        return Math.min(left, right) + triangle.get(level).get(elementIndex);
    }
}
