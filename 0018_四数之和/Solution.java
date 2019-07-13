
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author winter
 * @date 2019/7/13 22:26
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        // 确认i的范围
        for (int i = 0; i < n-3 ; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // 最小的四个的和不能大于target
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            // 最大的三个加上nums[i]都比target小，则遍历nums[i]加上最大的三个
            if (nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) continue;
            // 确认j的范围
            for (int j = i + 1; j < n - 2; j++) {
                if (j - i > 1 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target) continue;
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp == target) {
                        List<Integer> tmpList = new LinkedList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        lists.add(tmpList);
                        while (left < right && nums[left] == nums[left + 1]) left += 1;
                        while (left < right && nums[right] == nums[right - 1]) right -= 1;
                        left += 1;
                        right -= 1;
                    } else if (tmp > target) right -= 1;
                    else left += 1;
                }
            }
        }
        return lists;
    }
}
