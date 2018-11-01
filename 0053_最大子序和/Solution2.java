package cn.winter.leetcode.q53;

/**
 * @author winter
 * @date 2018/11/1 22:42
 */
public class Solution2 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
       return maxMergeArray(nums,0,len-1);
    }

    private int maxMergeArray(int[] nums, int l, int r) {
        if (l == r)
            return nums[l];
        int mid = l+(r-l)/2;
        int left = maxMergeArray(nums,l,mid);
        int right = maxMergeArray(nums,mid+1,r);
        int mids = maxMidArray(nums,l,mid,r);
        return Math.max(left,Math.max(mids,right));
    }

    private int maxMidArray(int[] nums, int l, int mid, int r) {
        int sum = 0;
        // 左半边包含 nums[mid] 元素，最多可以到什么地方
        // 走到最边界，看看最值是什么
        // 计算以 mid 结尾的最大的子数组的和
        int leftMaxSum = Integer.MIN_VALUE;
        for (int i = mid; i >=l ; i--) {
            sum += nums[i];
           if (sum>leftMaxSum)
               leftMaxSum = sum;
        }
        sum = 0;
        int rightMaxSum = Integer.MIN_VALUE;
        for (int i = mid+1;i<=r;i++){
            sum+=nums[i];
            if (sum>rightMaxSum)
                rightMaxSum = sum;
        }
        return leftMaxSum+rightMaxSum;
    }
}
