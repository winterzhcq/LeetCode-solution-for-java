
/**
 * @author winter
 * @date 2019/9/26 22:26
 */
public class Solution02 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (haystack.equals("")) return -1;
        int m = needle.length();
        int[][] dp = new int[m][256];
        int X = 0;
        dp[0][needle.charAt(0)] = 1;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < 256 ; j++) {
                dp[i][j] = dp[X][j];
            }
            dp[i][needle.charAt(i)] = i + 1;
            X = dp[X][needle.charAt(i)];
        }
        int s = 0;
        for (int i = 0; i < haystack.length(); i++) {
            s = dp[s][haystack.charAt(i)];
            if (s == m) {
                return i - m + 1;
            }
        }
        return -1;
    }
}
