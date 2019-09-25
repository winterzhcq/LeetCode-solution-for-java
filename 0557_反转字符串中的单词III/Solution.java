
/**
 * @author winter
 * @date 2019/9/25 21:19
 */
public class Solution {
    /**
     * 反转一个句子中的每个单词，用空格区分，保留空格的顺序
     * @param s
     * @return
     */
    public String reverseWords(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int begin = 0,end = 0;
        for (int i = 0; i < s.length() ; i++) {
            StringBuilder reverse = null;
            if (s.charAt(i) == ' '|| i == s.length() -1){
                end = i;
                String temp = i == s.length() - 1 ? s.substring(begin) : s.substring(begin,end);
                reverse = new StringBuilder(temp).reverse();
                begin = end+1;
                stringBuilder.append(reverse+" ");
            }
        }
        return stringBuilder.toString().trim();
    }
    public static void main(String[] args) {
        Solution demo05 = new Solution();
        System.out.println(demo05.reverseWords("WARNING: A HTTP GET method, public void com.engine.integration"));
    }
}
