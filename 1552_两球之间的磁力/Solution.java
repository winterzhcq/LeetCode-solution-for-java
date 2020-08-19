class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int hi = (position[position.length - 1] - position[0]) / (m - 1);
        int lo = 1;
        int ans = 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(position, mid, m)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    boolean check(int[] position, int distance, int m) {
        int count = 1;
        int i = 0;
        for (int j = 1; j < position.length; j++) {
            if (position[j] - position[i] >= distance) {
                i = j;
                count++;
                if (count >= m) return true;
            }
        }
        return false;
    }
}