class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = arr[i] % 2 != 0 ? ++count : 0;
            if (count == 3) return true;
        }
        return false;
    }
}