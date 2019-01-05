public class Solution {
    public int removeDuplicates(int[] nums) {
        if ( nums.length == 0 || nums == null)
            return 0;
        int result = 0;
        for (int i = 1;i<nums.length;i++) {
            if (nums[i] != nums[result]) {
                result++;
                nums[result] = nums[i];
            }
        }
        return result+1;
    }
}
