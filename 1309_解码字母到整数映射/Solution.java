
/**
 * @author winter
 * @date 2020/1/8 21:49
 */
public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                res.append((char) ('j' + Integer.parseInt(s.substring(i, i + 2)) - 10));
                i += 2;
            } else {
                res.append((char) ('a' + Integer.parseInt(s.charAt(i) + "") - 1));
            }
        }
        return res.toString();
    }
}
