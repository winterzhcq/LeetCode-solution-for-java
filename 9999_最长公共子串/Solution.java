
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

/**
 * @author winter
 * @date 2019/6/13 17:15
 */
public class Solution {
    public String longestCommon(String str1, String str2) {
        String result = "";
        int maxcommon = 0;
        if (str1 == null || str2 == null)
            return null;
        for (int i = 0; i < str1.length(); i++) {
            int begin = i, index = i;
            for (int j = 0; j < str2.length() && index < str1.length(); j++) {
                if (str1.charAt(index) == str2.charAt(j)) {
                    index++;
                } else {
                    if (maxcommon < index - begin) {
                        maxcommon = index - begin;
                        result = str1.substring(begin, index);
                    }
                    index = i;
                }
            }
            if (maxcommon < index - begin) {
                maxcommon = index - begin;
                result = str1.substring(begin, index);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommon("abcdsfdsdagdsg","abcdegdsg"));
    }
}
