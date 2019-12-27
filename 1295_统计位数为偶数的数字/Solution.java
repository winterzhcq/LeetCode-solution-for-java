class Solution {
    public int findNumbers(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        for(int s : nums ){
             if(String.valueOf(s).length()%2==0){
                count++;
            }
        }
        return count;
    }
}