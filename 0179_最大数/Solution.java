
import java.util.Arrays;

/**
 * @author winter
 * @date 2020/3/18 22:31
 */
public class Solution {
    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(asStrs,(a,b)->(a+b).compareTo(b+a));
        if (asStrs[0].equals("0")) return "0";

        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }
        return largestNumberStr;
    }

    public static void main(String[] args) {
        String[] c = new String[]{"1","2","3"};
        Arrays.sort(c,(a,b)->(b+a).compareTo(a+b));
        System.out.println(Arrays.toString(c));
    }
}
