
/**
 * @author winter
 * @date 2019/9/11 23:04
 */
/**
 * 正数的范围在1-(nums.length+1)之间,我们抛弃原始数据小于等于0的和大于length的
 * 把在该范围的保存在一个新的数组中
 * 最后我们遍历行的数组，从下标一开始，当遍历到等于0的直接返回下标，找到最小正数
 * 如果遍历完了还没找到，说明数存放的全是正数而且全部是连续的，直接返回length+1
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int[] temp = new int[length+1];
        for (int i = 0; i < length; i++) {
            if (nums[i] <= length && nums[i] > 0)
                temp[nums[i]] = nums[i];
        }
        for (int i = 1; i < length ; i++) {
            if (temp[i] == 0)
                return i;
        }
        return length+1;
    }
}
