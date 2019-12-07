
import java.util.Stack;

/**
 * @author winter
 * @date 2019/12/7 23:37
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int num = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') num++;
            else num--;
            if (num == 0) res++;
        }
        return res;
    }
}
