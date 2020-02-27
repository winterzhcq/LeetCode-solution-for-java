class Solution {
    public int findPeakElement(int[] nums) {
        return help(nums,0,nums.length-1);
    }
    private int help(int[] nums,int l ,int r){
        if(l == r) return l;
        int mid = l + (r-l)/2;
        if(nums[mid] > nums[mid+1] )
            return help(nums,l,mid);
        return help(nums,mid+1,r);
    }
}