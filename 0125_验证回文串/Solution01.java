
/**
 * @author winter
 * @date 2019/11/12 22:26
 */
public class Solution01 {
    public boolean isPalindrome(String s) {
        int i = 0,j = s.length() - 1;
        while(i <  j){
            while(i<j && (s.charAt(i)< 48 || (s.charAt(i)>57 &&s.charAt(i) < 65) || (90 < s.charAt(i) && s.charAt(i)< 97) || s.charAt(i) > 122)) i++;
            while(i<j && (s.charAt(j)< 48 || (s.charAt(j)>57 &&s.charAt(j) < 65) || (90 < s.charAt(j) && s.charAt(j)< 97) || s.charAt(j) > 122)) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;j--;
        }
        return true;
    }


    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        System.out.println(solution01.isPalindrome("0P"));

    }
}
