
/**
 * @author winter
 * @date 2020/1/12 21:31
 */
public class Solution {
    /**
     * 使用动态规划解决，求最大的序列可以转换成求每一个下标的最大值
     * maxDP[i + 1] = max(maxDP[i] * A[i + 1], A[i + 1],minDP[i] * A[i + 1])
     * minDP[i + 1] = min(minDP[i] * A[i + 1], A[i + 1],maxDP[i] * A[i + 1])
     * dp[i + 1] = max(dp[i], maxDP[i + 1])
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = Integer.MIN_VALUE,min = 1,max = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(nums[i]*max,nums[i]);
            min = Math.min(nums[i]*min,nums[i]);
            result = Math.max(max,result);
        }
        return result;
    }
}
