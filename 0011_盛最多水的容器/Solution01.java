
public class Solution01 {
    /**
     * 双指针
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int l = 0,r=height.length,area = 0;
        while (l < r){
            area = Math.max(area,Math.min(height[l],height[r])*(r-l));
            if (height[l]<height[r])
                 l++;
            else
                r++;
        }
           return area;
    }
}
