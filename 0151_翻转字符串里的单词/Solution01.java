
/**
 * @author winter
 * @date 2020/2/18 22:25
 */
public class Solution01 {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("\\s+");

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
