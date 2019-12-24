
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/12/24 22:15
 */
public class Solution {
    List<String> list = new ArrayList<>();

    public List<String> letterCasePermutation(String S) {
        helper("", S);
        return list;
    }

    private void helper(String s, String s1) {
        if (s1.length() == 0) {
            list.add(s);
            return;
        }
        char c = s1.charAt(0);
        helper(s + c, s1.substring(1));
        if (c >= 'a' && c <= 'z') {
            helper(s + Character.toUpperCase(c), s1.substring(1));
        } else if (c >= 'A' && c <= 'Z') {
            helper(s + Character.toLowerCase(c), s1.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.letterCasePermutation("a");

    }
}
