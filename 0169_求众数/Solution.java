
import java.util.HashMap;
import java.util.Map;

/**
 * @author winter
 * @date 2019/10/8 21:22
 */
public class Solution {
    public int majorityElement(int[] nums) {
         Map<Integer, Integer> map = getSequence(nums);
        Map.Entry<Integer,Integer> temp = null;
        for (Map.Entry<Integer,Integer>  entry : map.entrySet()) {
            if (temp == null || entry.getValue() > temp.getValue())
                temp = entry;
        }
        return temp.getKey();
    }
    private Map<Integer,Integer> getSequence(int[] nums){
        Map<Integer,Integer> map  = new HashMap<>();
        if (nums == null || nums.length == 0 ) return null;
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return map;
    }
}
