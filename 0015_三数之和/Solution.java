

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //对数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 ; i++) {
            if (i == 0 ||(i > 0 && nums[i] != nums[i-1])){ //如果有重复的直接跳过，进入下一次循环
                int l = i+1,r = nums.length-1,sum = 0 - nums[i];
                while (l < r){ //两个指针，从数组两头遍历
                    if (sum == nums[l] + nums[r]){
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while (l < r && nums[l] == nums[l+1]) l++; //跳过左边的重复元素
                        while (l < r && nums[r] == nums[r-1]) r--; //跳过右边重复元素
                        l++;
                        r--;
                    }else if (sum > nums[l] + nums[r]) l++;
                    else r--;
                }
            }
        }
        return res;
    }
}
