
/**
 * @author winter
 * @date 2019/8/25 22:29
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int lenght = length2+length1;
        int i = lenght%2;
        if (i != 0){
            int l =0, r= 0,media = 0;
            for (int j = 0; j <= lenght/2 ; j++) {
                if (l == nums1.length){
                    media = nums2[r];
                    r++;
                }else if ( r == nums2.length){
                    media = nums1[l];
                    l++;
                }else if (nums1[l] < nums2[r]){
                    media = nums1[l];
                    l++;
                }else {
                    media = nums2[r];
                    r++;
                }
            }
            return media;
        }else if (i == 0){
            int l =0, r= 0,media = 0,premedia = 0;
            for (int j = 0; j <= lenght/2 ; j++) {
                if (l == nums1.length){
                    premedia = media;
                    media = nums2[r];
                    r++;
                }else if ( r == nums2.length){
                    premedia = media;
                    media = nums1[l];
                    l++;
                }else if (nums1[l] < nums2[r]){
                    premedia = media;
                    media = nums1[l];
                    l++;
                }else {
                    premedia = media;
                    media = nums2[r];
                    r++;
                }
            }
            return (media+premedia) / 2.0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,3},b[] = {2};
        double s = solution.findMedianSortedArrays( a,b);
        System.out.println(s);
    }
}
