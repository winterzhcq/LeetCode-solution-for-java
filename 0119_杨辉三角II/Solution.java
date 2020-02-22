
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2020/2/22 23:16
 */
public class Solution {
    /**
     * 分析题意，可以使用递归解决，把当前问题拆分成多个子问题
     * 把子问题的解组合成原问题的解
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        return getRow(rowIndex, result);
    }

    private List<Integer> getRow(int rowIndex, List<Integer> result) {
        if (rowIndex < 0) return result;
        result.add(1);
        for (int i = result.size() - 2; i > 0 ; i--) {
            result.set(i,result.get(i)+result.get(i-1));
        }
        return getRow(rowIndex-1,result);
    }
}
