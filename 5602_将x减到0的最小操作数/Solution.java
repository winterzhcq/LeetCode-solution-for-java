

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 前缀和+后缀和
     * @param nums
     * @param x
     * @return
     */
    public int minOperations(int[] nums, int x) {
        int length = nums.length;
        int[] preSum = new int[length+1];
        int[] latterSum = new int[length+1];
        for (int i = 0; i < length; i++) {
            preSum[i+1] = preSum[i]+nums[i];
        }
        Map<Integer,Integer> map  = new HashMap<>();
        map.put(0,0);
        for (int i = length-1;i>=0;i--){
            latterSum[i] = latterSum[i+1] + nums[i];
            map.put(latterSum[i],length-i);
        }
        if (preSum[length] < x) return -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < length+1; i++) {
            if (map.containsKey(x - preSum[i])) res = Math.min(res,map.get(x-preSum[i])+i);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
