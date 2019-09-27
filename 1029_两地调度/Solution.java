
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author winter
 * @date 2019/9/27 22:26
 */
public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o1[1]-(o2[0]-o2[1]);
            }
        });
        int total = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i) total += costs[i][0] + costs[i + n][1];
        return total;
    }
}
