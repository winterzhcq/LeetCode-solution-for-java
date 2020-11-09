
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>(l.length);
        for (int i = 0; i < l.length; i++) {
            int[] temp = new int[r[i] - l[i] + 1];
            for (int j = l[i]; j < r[i]; j++) {
                temp[j - l[i]] = nums[j];
            }
            Arrays.sort(temp);
            ans.add(checkTempArray(temp));
        }
        return ans;
    }

    private Boolean checkTempArray(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2]) {
                return false;
            }
        }
        return true;
    }
}
