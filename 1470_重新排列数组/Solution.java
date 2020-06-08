class Solution {
 public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int i = 0;
        int j = 0;
        while (i<n){
            result[j++] = nums[i];
            result[j++] = nums[n+i];
            i++;
        }
        return result;
    }
}