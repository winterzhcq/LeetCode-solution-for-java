class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int len = nums.length;
        for(int i=1;i<=max&&i<len;i++)
            max = max > nums[i]+i ? max : nums[i]+i;
        return max >= nums.length-1;
        }
}