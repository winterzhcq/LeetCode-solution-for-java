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
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0; //�����ϰ���·��·������Ϊ1

                else if(i == 0 && j==0) dp[0][0] = 1; //��һ��Ĭ��·��Ϊ1
                
                else if(i == 0 && j>0) dp[0][j] = dp[0][j-1]; //��һ�����û���ϰ�·��Ϊ1�����ϰ�����Ϊ0
                
                else if(i >0 && j==0) dp[i][0] = dp[i-1][0];//��һ�������û���ϰ�·��Ϊ1�����ϰ�����Ϊ0
                
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];//ÿ�������·��������������Ϸ���·����������󷽵�·����֮��
                
            }
        }
        return dp[m-1][n-1];
    }
}