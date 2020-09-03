class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        if(n < m * k) return false;
        int i, j;
        for(i = 0; i <= n - m * k; i++) {
            for(j = i + m; j < i + m * k; j++) {
                if(arr[j] != arr[j - m]) break;
            }
            if(j == i + m * k) return true;
        }
        return false;
    }
}