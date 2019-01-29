public class Solution {
    public int[][] generateMatrix(int n) {
        int number = 1;
        int[][] a = new int[n][n];
        int l =0,up = 0,r = n-1,down = n-1;
        while (l <= r && up <= down){
            for (int i = l; i <= r ; i++) {
                a[up][i] = number++;
            }
            for (int i = up +1; i <= down; i++) {
                a[i][r] = number++;
            }
            for (int i = r -1; i >=l && up < down ; i--) {
                a[down][i] = number++;
            }
            for (int i = down -1; i > up && l < r ; i--) {
                a[i][l] = number++;
            }
            l++;
            up++;
            r--;
            down--;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateMatrix(3);
    }
}
