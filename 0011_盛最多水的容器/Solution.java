
public class Solution {
    /**
     * 暴力法
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length ; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp = (j - i) * Math.min(height[i], height[j]);
                area = Math.max(temp, area);
            }
        }
        return area;
    }

}
