
/**
 * @author winter
 * @date 2019/12/15 21:37
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1 == null || version1.length() == 0 || version2 == null || version2.length() == 0) return 0;
         String[] v1 = version1.split("\\.");
         String[] v2 = version2.split("\\.");
         int length1 = v1.length;
         int length2 = v2.length;
         int max = Math.max(length1,length2);
        for (int i = 0; i < max ; i++) {
            int a = (i < length1? Integer.valueOf(v1[i]) : 0);
            int b = (i < length2 ? Integer.valueOf(v2[i]) : 0);
            if(a < b) return -1;
            else if(a > b) return 1;
        }
      return 0;
     }

    public static void main(String[] args) {
        Solution solution = new Solution();
         int i = solution.compareVersion("1", "0");
        System.out.println(i);
    }
}
