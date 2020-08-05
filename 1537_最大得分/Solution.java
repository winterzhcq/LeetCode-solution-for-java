class Solution {
       public int maxSum(int[] nums1, int[] nums2) {
        int MOD = 1000000007;
        int n1 = 0;
        int n2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        long ans = 0;

        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] == nums2[n2]) {
                ans = (ans + nums1[n1]);
                ans = (ans + Math.max(sum1, sum2));
                sum1 = 0;
                sum2 = 0;
                n1++;
                n2++;
            } else if (nums1[n1] > nums2[n2]) {
                sum2 = (sum2 + nums2[n2]);
                n2++;
            } else {
                sum1 = (sum1 + nums1[n1]);
                n1++;
            }
        }
        for (int i = n1; i < nums1.length; i++) {
            sum1 = (sum1 + nums1[i]);
        }
        for (int i = n2; i < nums2.length; i++) {
            sum2 = (sum2 + nums2[i]);
        }
        ans = (ans + Math.max(sum1, sum2)) % MOD;
        return (int) ans;
    }
}