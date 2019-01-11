
/**
 * @author winter
 * @date 2019/1/11 10:21
 */
public class Solution01 {
    /**
     * 采用递归回溯的思想
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);

    }
    public int search(int[] nums, int target,int begin,int end){
        if (begin>end)
            return -1;
        int mid = (begin+end)/2 ;
        if (target == nums[mid])
            return mid;
        if (nums[begin] <= nums[mid]){
            if (target>=nums[begin] && target<nums[mid])
                return search(nums,target,begin,mid-1);
            else
               return search(nums,target,mid+1,end);
        }else {
            if (target>nums[mid] && target<=nums[end])
                return search(nums,target,mid+1,end);
            else
                return search(nums,target,begin,mid-1);
        }
    }
}
