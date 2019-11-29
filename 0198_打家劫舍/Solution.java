
/**
 * @author winter
 * @date 2019/11/29 23:33
 */
public class Solution {
    /**
     * 找出状态转移方程dp[i] = max(dp[i-2]+dp[i],dp[i-1])
     * 针对1个元素和两个元素单独处理，最开始的两个不要忘记处理
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        if(nums[0] > nums[1]) nums[1] = nums[0];
        for(int i = 2;i<nums.length;i++){
            nums[i] = Math.max(nums[i-2]+nums[i],nums[i-1]);
        }
        return nums[nums.length-1];
    }
}
