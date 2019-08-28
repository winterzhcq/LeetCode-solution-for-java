
/**
 * @author winter
 * @date 2019/8/28 22:59
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int i = 0;
        for ( ; i < length && nums[i] < target; i++) {
            if (target == nums[i])
                return i+1;
        }
        return i;
    }
}
