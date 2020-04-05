class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            sum +=nums[i];
        }
        for(int i = nums.length-1;i>=0;i--){
            result +=nums[i];
            list.add(nums[i]);
            if (result > sum - result) break;
        }
        return list;
    }

}