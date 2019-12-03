
/**
 * @author winter
 * @date 2019/12/3 21:17
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) return true;
        if (t.length() < s.length()) return false;
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) j++;
            if (j == s.length() - 1) return true;
        }
        return false;
    }
}
