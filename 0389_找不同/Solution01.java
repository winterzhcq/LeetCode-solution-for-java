
/**
 * @author winter
 * @date 2019/12/25 21:34
 */
public class Solution01 {
    public char findTheDifference(String s, String t) {
        char a =0;
        for(int i = 0 ; i < s.length() ; i++){
            a^=s.charAt(i);
        }
        for(int i = 0 ; i < t.length() ; i++){
            a^=t.charAt(i);
        }
        return a;
    }

    public static void main(String[] args) {
        String a = "abcde";
        String b = "abcdef";
        char c = 'a';
        char d = 'a';
        System.out.println(c^d);
    }
}
