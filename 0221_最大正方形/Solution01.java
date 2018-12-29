
public class Solution01 {
    /**
     * 使用一位数组解决，其中dp[j-1]表示当前坐标左边的点可以形成正方形的最大边长；
     * 等号右边dp[j]表示当前坐标上边的点可以形成最大正方形的最大边长；
     * pre记录的是当前坐标的左上角的点可以形成的正方形的最大边长；
     * 等号左边的dp[j]表示当前点可以形成正方形的最大边长。
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length,colos = rows>0 ? matrix[0].length : 0;
        int[] dp = new int[colos+1];
        int pre = 0;
        int maxlen = 0;
        for (int i = 1; i <=rows; i++) {
            for (int j =1; j <=colos ; j++) {
                int temp = dp[j];
                if (matrix[i-1][j-1] == '1'){
                    dp[j] = Math.min(Math.min(dp[j-1],pre),dp[j])+1;
                    maxlen = Math.max(maxlen,dp[j]);
                }else {
                    dp[j] = 0;
                }
                pre = temp;
            }
        }
        return maxlen*maxlen;
    }
}
