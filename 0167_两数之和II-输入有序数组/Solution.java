
/**
 * 双指针
 * @author winter
 * @date 2019/9/16 22:22
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0,right = length;
        while (left < right){
            if (target == numbers[left] + numbers[right])
                return new int[]{left+1,right+1};
            if (target > (numbers[left] + numbers[right]))
                left++;
            else right--;
        }
        return null;
    }
}
