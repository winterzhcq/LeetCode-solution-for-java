
public class Solution {

    public int numSub(String s) {
        int len = s.length(), left = 0, right = 0;
        long out = 0, temp;
        while (right < len) {
            if (s.charAt(right++) == '0') {
                temp = right - left;
                out += (temp - 1) * temp / 2;
                left = right;
            }
        }
        if (s.charAt(len - 1) == '1') out += (right - left) * (right - left + 1) / 2;
        return (int) (out % 1000000007);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.numSub("111111");
        System.out.println(i);
    }
}
