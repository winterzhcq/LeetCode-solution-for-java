
/**
 * @author winter
 * @date 2019/4/7 13:19
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int len = prices.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len ; j++) {
                int temp = prices[j] - prices[i];
                max = temp > max ? temp : max;
            }
        }
        return max;
    }
}
