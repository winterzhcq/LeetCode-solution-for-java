
/**
 * @author winter
 * @date 2019/12/28 20:39
 */
public class Solution {
    /**
     * 和84题比较类似
     * @param matrix
     * @return
     */
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int maxarea = 0;
        int row = matrix.length;
        int col = row == 0 ? 0 : matrix[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if(matrix[i][j] == '1'){
                    dp[i][j] = j == 0 ? 1 : dp[i][j - 1] + 1;
                    int width = dp[i][j];
                    for (int k = i; k >=0 ; k--) {
                        width = Math.min(width,dp[k][j]);
                        maxarea = Math.max(maxarea,width*(i-k+1));
                    }
                }
            }
        }
        return maxarea;
    }
}
