
public class Solution {
    public int myAtoi(String str) {
        if( str.trim().isEmpty() || str.length() == 0)
            return 0;
        String s = str.trim();
        int result = 0;
        if (s.charAt(0)=='-') {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)>'8'))
                        return Integer.MIN_VALUE;
                    result = result * 10 + s.charAt(i)-'0';
                } else {
                    break;
                }
            }
          return -result;
        } else if (s.charAt(0)=='+'){
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)>'7'))
                        return Integer.MAX_VALUE;
                    result = result * 10 + s.charAt(i)-'0';
                } else {
                    break;
                }
            }
            return result;
        } else {
            for (int i = 0; i < s.length() ; i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)>'7'))
                        return Integer.MAX_VALUE;
                    result = result * 10 + s.charAt(i)-'0';
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
