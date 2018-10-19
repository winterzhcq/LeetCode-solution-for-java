class Solution01 {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0 ; i < nums.length; i ++)
            for(int j = 0 ; j < nums.length ; j ++)
                if(nums[i] + nums[j] == target && i!=j){
                    int[] res = {i, j};
                    return res;
                }

        throw new IllegalStateException("the input has no solution");
    }
}