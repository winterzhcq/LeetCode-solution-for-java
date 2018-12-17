public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length() ; i++) {
            //如果回文数是奇数
            int len1 = expandAroundCenter(s,i,i);
            //如果回文数是偶数
            int len2 = expandAroundCenter(s,i,i+1);
            int max = Math.max(len1,len2);
            if (max > end-start){
                start = i - (max-1)/2;
                end = i + max/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int expandAroundCenter(String s,int left, int right) {
        int L = left,R=right;
        //查找回文数
        while (L >= 0 && R<s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
