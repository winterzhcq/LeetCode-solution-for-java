
public class Solution {
    /**
     * 注意边界问题
     * @param nums
     * @return
     */
    final long MIN = Long.MIN_VALUE;
    public int thirdMax(int[] nums) {
        long one=MIN,two=MIN,three=MIN;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>one) {
                three=two;
                two=one;
                one=nums[i];
            }else if(nums[i]>two&&nums[i]<one) {
                three=two;
                two=nums[i];
            }else if(nums[i]>three&&nums[i]<two)
                three=nums[i];
        }
        if(three==-Long.MAX_VALUE) return (int)one;
        else return (int)three;
    }
}
