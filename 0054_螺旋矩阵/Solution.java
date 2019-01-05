public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0 )
            return list;
        int l = 0,r = matrix[0].length-1,up = 0,down = matrix.length -1;
        while (l <= r && up <= down){
            for (int i = l; i <=r ; i++) {
                list.add(matrix[up][i]);
            }
            for (int i = up+1; i <= down; i++) {
                list.add(matrix[i][r]);
            }
            for (int i = r-1; up<down && i >=l ; i--) {
                list.add(matrix[down][i]);
            }
            for (int i = down-1; r>l && i > up ; i--) {
                list.add(matrix[i][l]);
            }
            l++;
            up++;
            r--;
            down--;
        }
        return list;
    }
}
