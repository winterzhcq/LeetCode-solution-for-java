
/**
 * @author winter
 * @date 2019/9/22 19:54
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0;
        int sum = 0;
        int length = 0;
        int path = 0;
        while (true){
             i = i % gas.length;
             if (sum + gas[i] >= cost[i]){
                 sum = sum+gas[i]-cost[i];
                 if (length == gas.length)
                     return i % gas.length;
                 length++;
             }else {
                 sum = 0;
                length = 0;
             }
            i++;
             if (path++ >= 2 * gas.length)
                 return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(new int[]{5,1,2,3,4},new int[]{4,4,1,5,1}));

    }
}
