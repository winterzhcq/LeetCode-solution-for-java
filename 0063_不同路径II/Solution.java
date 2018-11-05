class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0 || obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length;
        if (m <= 0) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0; //遇见障碍把路径路径设置为1

                else if(i == 0 && j==0) dp[0][0] = 1; //第一个默认路径为1
                
                else if(i == 0 && j>0) dp[0][j] = dp[0][j-1]; //第一列如果没有障碍路径为1，有障碍设置为0
                
                else if(i >0 && j==0) dp[i][0] = dp[i-1][0];//第一行列如果没有障碍路径为1，有障碍设置为0
                
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];//每个方框的路径数等于其紧邻上方的路径数与紧邻左方的路径数之和
                
            }
        }
        return dp[m-1][n-1];
    }
}