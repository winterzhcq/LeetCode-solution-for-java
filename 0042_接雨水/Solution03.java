
/**
 * @author winter
 * @date 2019/9/8 10:24
 */
public class Solution03 {
    /**
     * 左右同时遍历
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int sum = 0,maxleft = 0,maxright = 0,length = height.length;
        int right = length-2;
        int left = 1;
        for (int i = 1; i < length - 1 ; i++) {
            if (height[left-1] < height[right+1]){
                maxleft = Math.max(maxleft,height[left-1]);
                if (maxleft > height[left]){
                    sum = sum+(maxleft - height[left]);
                }
                left++;
            }else {
                maxright = Math.max(maxright,height[right+1]);
                if (maxright > height[right]){
                    sum = sum+(maxright - height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}
