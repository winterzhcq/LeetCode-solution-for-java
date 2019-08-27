
/**
 * @author winter
 * @date 2019/8/27 22:41
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if (nums == null || nums.length == 0)
            return result;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                if (result[0] == -1){
                    result[0] = i;
                    result[1] = i;
                }else {
                    result[1] = i;
                }
            }
        }
        return result;
    }
}
