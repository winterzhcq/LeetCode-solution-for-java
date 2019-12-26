
/**
 * @author winter
 * @date 2019/12/26 20:53
 */
public class Solution01 {
    /**
     * 优化，动态规划的途中添加功能
     * 第一步，分析该题是典型的动态规划的小变种，在动态规划的基础上增加了求正方形的和
     * 第一步，dp的每一个坐标代表正方形的最多个数，然后加上所有的dp[i][j]，
     * dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = row > 0 ? matrix[0].length : 0;
        int[][] dp = new int[row][col];
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                } else if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                }
                count += dp[i][j];
            }
        }
        return count;
    }
}
