
import java.util.List;

/**
 * @author winter
 * @date 2019/9/1 0:59
 */
public class Solution01 {
    public String convert(String s, int numRows) {
        if (s == null || numRows == 1)
            return s;
        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(i + j));
                // 不是第一行或则最后一行，每一次遍历需要多添加一个参数
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
