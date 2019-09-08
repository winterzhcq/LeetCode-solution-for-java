
/**
 * @author winter
 * @date 2019/9/8 9:50
 */
public class Solution02 {
    public int trap(int[] height) {
        int sum = 0,maxleft = 0,length = height.length;
        int[] maxright = new int[length];
        for (int i = length-2; i >=0 ; i--) {
            maxright[i] = Math.max(maxright[i+1],height[i+1]);
        }
        for (int i = 1; i < length-1 ; i++) {
            maxleft = Math.max(maxleft,height[i-1]);
            int temp = Math.min(maxleft,maxright[i]);
            if ( temp > height[i])
                sum+= temp - height[i];
        }
        return sum;
    }
}
