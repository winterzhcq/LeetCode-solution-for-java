
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/7/12 11:50
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0)
            return triangle;
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            // 获取上一行的元素
            List<Integer> pre = triangle.get(i-1);
            // 第一行的每一个元素始终为1
            row.add(1);
            for (int j = 1; j < i ; j++) {
                row.add(pre.get(j-1)+pre.get(j));
            }
            // 每一行的最后一个元素始终为1
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
