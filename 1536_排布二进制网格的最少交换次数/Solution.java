class Solution {
     public int minSwaps(int[][] grid) {
        int minStep = 0;
        List<Integer> list = new LinkedList<>();
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] != 0) break;
                count++;
            }
            list.add(count);
        }
        for (int i = 0; i < n; i++) {
            int count = n - i - 1;
            int j = i;
            while (j < n) {
                if (list.get(j) >= count) {
                    minStep += j - i;
                    Integer remove = list.remove(j);
                    list.add(0, remove);
                    break;
                }
                j++;
            }
            if (j == n) return -1;
        }
        return minStep;
    }
}