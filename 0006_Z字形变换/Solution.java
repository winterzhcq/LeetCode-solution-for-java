
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/9/1 0:07
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows == 1)
            return s;
        // 纯在 s的长度比numRow小的情况
        int rownumber = Math.min(s.length(), numRows);
        List<StringBuilder> rows = new ArrayList<>();
        // 防止空指针异常
        for (int i = 0; i < rownumber; i++) rows.add(new StringBuilder());
        int curRow = 0;
        boolean goingDown = false;//是否改变方向
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }

    public static void main(String[] args) {
        Solution  solution = new Solution();
        System.out.println(solution.convert("AB",1));
    }
}
