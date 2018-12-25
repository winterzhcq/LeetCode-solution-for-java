
import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        int sum = nums[0] +nums[1] + nums[length-1];
        for (int i = 0; i < length -2 ; i++) {
            int l = i+1,r = length-1;
            while (l < r ){
                int temp = nums[l]+nums[r]+nums[i];
                if (temp < target)
                    l++;
                else r--;
                if (Math.abs(temp-target) < Math.abs(sum -target))
                    sum = temp;
            }
        }
        return sum;
    }
}
