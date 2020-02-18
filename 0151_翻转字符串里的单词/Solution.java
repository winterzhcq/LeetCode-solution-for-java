
/**
 * @author winter
 * @date 2020/2/18 22:07
 */
public class Solution {

    public String reverseWords(String s) {
        if (s == null || s.trim().equals("")) return "";
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equals("")) continue;
            str.append(words[i]);
            str.append(" ");
        }
        return str.toString().substring(0, str.length() - 1);
    }

}
