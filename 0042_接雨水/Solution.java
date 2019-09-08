
/**
 * @author winter
 * @date 2019/9/8 9:20
 */
public class Solution {
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1 ; i++) {
            int maxleft=0, maxright = 0;
            for (int j = 0; j < i ; j++) {
                if (maxleft < height[j]) maxleft = height[j];
            }
            for (int j = i+1; j < height.length ; j++) {
                if (maxright > height[j]) maxright = height[j];
            }
            int temp = Math.min(maxleft,maxright);
            if ( temp > height[i])
                sum+= temp - height[i];
        }
        return sum;
    }
}
