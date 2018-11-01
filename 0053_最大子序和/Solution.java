class Solution {
    //求解关键：连续子数组的问题，求解以当前元素结尾的最大连续数组
    //1.包含最后本身的连续最大数组和
    //2.只有自己的
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i = 1;i<len;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
        }
        int res = dp[0];
        for(int i = 1;i<len;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}