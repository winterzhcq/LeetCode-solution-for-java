
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author winter
 * @date 2019/2/15 21:26
 */
public class Solution {
    /**
     * 递归回溯的方法
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        subsets(lists,new ArrayList<>(),nums,0);
        return lists;
    }

    /**
     * https://www.cnblogs.com/Xieyang-blog/p/9078268.html
     * []———————从空开始
     * [1]——————以空开头的第一个
     * [1, 2]——————以1开头的第一个
     * [1, 2, 3]——————以12开头的第一个，此时到3了，说明以12开头的子集结束，删掉2，此时回溯到以1开头
     * [1, 3]——————以1开头的第二个，此时又到3，以1开头的子集结束，删掉1，回溯到以空开头
     * [2]——————以空开头的第二个
     * [2, 3]——————以2开头的第一个，此时到3，以2开头的子集结束，删掉2，回溯到以空开头
     * [3]——————以空开头的最后一个
     * @param lists
     * @param list
     * @param nums
     * @param start
     */
    private void subsets(List<List<Integer>> lists, List<Integer> list, int[] nums, int start) {
        lists.add(new ArrayList<>(list));
        for (int j = start; j < nums.length; j++) {
            if(j > start && nums[j] == nums[j-1]) continue;
            list.add(nums[j]);
            subsets(lists,list,nums,start+1);
            //删除
            list.remove(list.size() - 1);
        }
    }
}
