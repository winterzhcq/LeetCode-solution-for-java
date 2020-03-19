
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author winter
 * @date 2020/3/19 22:33
 */
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i < matrix.length;i++){
            int min = matrix[i][0];
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] < min) min = matrix[i][j];
            }
            temp.add(min);
        }
        for(int i = 0 ; i < matrix[0].length;i++){
            int max = matrix[i][0];
            for(int j = 0; j < matrix.length;j++){
                if(matrix[j][i] > max) max = matrix[j][i];
            }
            if(temp.contains(max)) list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> list = solution.luckyNumbers(a);
        System.out.println(list.toString());
    }
}
