class Solution1 {
    public int uniquePaths(int m, int n) {
    //我们是一行一行求解的,实际上我们只需要记录遍历到(i, j)这个位置的时候当前行有几种路径,如果遍历到(i, m-1)的时候,替换掉这一行对应列的路径即可，于是     //状态转移方程编程: res[j] = res[j] + res[j-1]
        int[] res = new int[n];
        res[0] = 1;
        for(int i = 0;i<m;i++){
            for(int j = 1;j<n;j++)
                res[j]+=res[j-1];
        }
        return res[n-1];
    }
}