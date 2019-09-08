
/**
 * @author winter
 * @date 2019/9/8 9:36
 */
public class Solution01 {
    public int trap(int[] height) {
        int sum = 0,length = height.length;
        int[] maxleft = new int[length];
        int[] maxright = new int[length];
        for (int i = 1; i < length-1 ; i++) {
            maxleft[i] = Math.max(maxleft[i-1],height[i-1]);
        }
        for (int i = length-2; i >=0 ; i--) {
            maxright[i] = Math.max(maxright[i+1],height[i+1]);
        }
        for (int i = 1; i < length-1 ; i++) {
            int temp = Math.min(maxleft[i],maxright[i]);
            if ( temp > height[i])
                sum+= temp - height[i];
        }
        return sum;
    }
}
