
/**
 * @author winter
 * @date 2019/9/25 22:24
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (!haystack.contains(needle)) return -1;
        int length = needle.length();
        int match = 0;
        int s = 0;
        for (int i = 0; i < haystack.length() ; i++) {
            match = i;
            while (match < haystack.length()&&s<length&&haystack.charAt(match) == needle.charAt(s)){
                match++;
                if (s == length-1)
                    return i;
                s++;
            }
            s = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("mississippi", "issip"));

    }
}
