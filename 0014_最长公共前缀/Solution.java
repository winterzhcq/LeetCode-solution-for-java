
/**
 * @author winter
 * @date 2018/10/15 23:37
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
	//²âÊÔ
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(s.indexOf("leetc"));
    }
}
