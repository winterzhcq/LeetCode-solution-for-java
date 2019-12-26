
/**
 * @author winter
 * @date 2019/12/26 20:53
 */
public class Solution {
    /**
     * 第一步，分析该题是典型的动态规划的小变种，在动态规划的基础上增加了求正方形的和
     * 第一步，dp的每一个坐标代表正方形的最多个数，然后加上所有的dp[i][j]，
     * dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = row > 0 ? matrix[0].length : 0;
        int[][] dp = new int[row+1][col+1];
        for (int i = 0; i < col; ++i)
            dp[0][i] = matrix[0][i];
        for (int i = 1; i < row; i++) {
            dp[i][0] = matrix[i][0];
            for (int j = 1; j < col ; j++) {
                if (matrix[i][j] == 1)
                dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
            }
        }
        int count = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                count += dp[i][j];
            }
        }
        return count;
    }
}
