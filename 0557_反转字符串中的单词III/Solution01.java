
/**
 * @author winter
 * @date 2019/9/25 21:50
 */
public class Solution01 {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (String st : str) result.append(st + " ");
        return result.toString();
    }
    public static void main(String[] args) {
        Solution01 demo05 = new Solution01();
        System.out.println(demo05.reverseWords("WARNING: A HTTP GET method, public void com.engine.integration"));
    }
}
