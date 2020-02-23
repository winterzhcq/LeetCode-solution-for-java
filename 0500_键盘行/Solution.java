
import java.util.*;

/**
 * @author winter
 * @date 2020/2/23 23:20
 */
public class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) map.put(c, 0);
        for (char c : "asdfghjklASDFGHJKL".toCharArray()) map.put(c, 1);
        for (char c : "zxcvbnmZXCVBNM".toCharArray()) map.put(c, 2);
        List<String> list = new ArrayList<>();
        for (String word : words) {
            boolean isword = true;
            int frist = map.get(word.charAt(0));
            for (int i = 1; i < word.length(); i++) {
                if (map.get(word.charAt(i)) != frist) {
                    isword = false;
                    break;
                }
            }
            if (isword) list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }
}
