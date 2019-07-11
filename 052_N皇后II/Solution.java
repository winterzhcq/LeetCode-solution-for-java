

/**
 * @author winter
 * @date 2019/7/11 10:55
 */
public class Solution {
    // 记录queens的位置
    int rows[];
    // 次对角线
    int hills[];
    // 主对角线
    int dales[];
    int n;
    public int totalNQueens(int n) {
        this.n = n;
        rows = new int[n];
        hills = new int[4 * n - 1];
        dales = new int[2 * n - 1];

        return backtrack(0,0,n,rows,hills,dales);
    }

    private int backtrack(int row, int count, int n, int[] rows, int[] hills, int[] dales) {
        for (int col = 0; col < n ; col++) {
            if (isNotUnderAttack(row, col)){
                // place queens
                rows[col] = 1;
                hills[row - col + 2 * n] = 1;  // "hill" diagonals 保证每条次对角线的唯一性，区间在[n+1,3n-1]为正
                dales[row + col] = 1;   //"dale" diagonals
                if (row + 1 == n) count++;
                else count = backtrack(row+1,count,n,rows,hills,dales);
                rows[col] = 0;
                hills[row - col + 2 * n] = 0;
                dales[row + col] = 0;
            }
        }
        return count;
    }

    private boolean isNotUnderAttack(int row, int col) {
        int res = rows[col] + hills[row - col + 2 * n] + dales[row + col];
        return (res == 0) ? true : false;
    }
}
