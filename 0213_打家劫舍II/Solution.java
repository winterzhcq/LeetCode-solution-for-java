
import java.util.Arrays;

/**
 * @author winter
 * @date 2019/11/30 22:02
 */
public class Solution {
    /**
     * 解决动态规划，求出状态转移方程
     * dp[i] = max(dp[i]+dp[i-2],dp[i-1])
     * 结合题目的条件，我们求出0-(n-1)和1-n的最大dp即可
     * 注意数组的深浅拷贝int a[] = nums,这是浅拷贝，修改a的值会直接影响nums的值
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        System.arraycopy(nums,0,dp1,0,nums.length);
        System.arraycopy(nums,0,dp2,0,nums.length);
        for(int i = 0;i<nums.length-1;i++){
            dp1[i] = Math.max( i >=1 ? dp1[i-1] : 0,(i >= 2 ? dp1[i-2]:0) + dp1[i]);
        }
        for(int i = 1;i<nums.length;i++){
            dp2[i] = Math.max( i >1 ? dp2[i-1] : 0,(i > 2 ? dp2[i-2]:0) + dp2[i]);
        }
        return Math.max(dp1[nums.length-2],dp2[nums.length-1]);
    }
}
