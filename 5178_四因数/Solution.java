class Solution {
   public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; ++i){
            int count = 0;
            int t = 0;
            for(int j = 2; j <= nums[i]/2; ++j){
                if(nums[i] % j == 0){
                    count++;
                    t = j;
                }
                if(count > 2)
                    break;
            }
            if(count == 2)
                res += (1+nums[i]+t+nums[i]/t);
        }
        return res;
    }
}