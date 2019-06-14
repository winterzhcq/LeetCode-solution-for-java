

/**
 * @author winter
 * @date 2019/6/14 14:12
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if(nums.length > 0){
            for (int i = 1; i < nums.length ; i++) {
                // 使用异或，相同为0，不同为1，XOR 满足交换律和结合律
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}
