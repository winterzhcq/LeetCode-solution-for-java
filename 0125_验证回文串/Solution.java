

/**
 * @author winter
 * @date 2019/7/11 22:26
 */
public class Solution {
    /**
     * 双指针左右遍历，i为左指针，j为右指针
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int i = 0,j = s.length() - 1;
        while (i < j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++; // 左指针遇见不是数字和字母跳过该字符
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--; // 右指针遇见不是数字和字母跳过该字符
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++; j--;
        }
        return true;
    }
}
