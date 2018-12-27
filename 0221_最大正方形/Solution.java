
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, clos = row > 0 ? matrix[0].length : 0;
        int[][] dp = new int[row+1][clos+1];
        int maxlen = 0;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=clos ; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1; //当前点的最大边长
                    maxlen = Math.max(maxlen,dp[i][j]);
                }
            }
        }
        return maxlen*maxlen;
    }
}
