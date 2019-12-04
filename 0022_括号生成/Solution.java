
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/12/4 21:40
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String str = new String();
        generateParenthesis(list, str, n, n);
        return list;
    }

    private void generateParenthesis(List<String> list, String str, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }
        if (left > 0) generateParenthesis(list, str + "(", left - 1, right);
        if (right > left) generateParenthesis(list, str + ")", left, right - 1);
    }
}
