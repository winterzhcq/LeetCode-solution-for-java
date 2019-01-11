
/**
 * @author winter
 * @date 2019/1/11 9:28
 */
class Solution {
    /**
     * 思路：无论数组如何旋转，至少一半的数组是有序的，我们分为两总情况
     * 要么数组左边有序，要么数组右边有序，我们只要对这两种情况一直二分
     * 查找就能找到该元素，如果没找到就返回-1结束；
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
       int begin = 0,end = nums.length-1;
       while (begin <= end){
           int mid = (begin+end+1)/2 ;
           if (target == nums[mid])
               return mid;
           if (nums[begin] <= nums[mid]){
                if (target>=nums[begin] && target<nums[mid])
                    end = mid -1;
                else
                    begin = mid+1;
           } else {
               if (target>nums[mid]&&target<=nums[end])
                   begin = mid+1;
               else
                   end = mid - 1;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a ={1,2,3,4,5,6,7};
        solution.search(a,2);
    }
}
