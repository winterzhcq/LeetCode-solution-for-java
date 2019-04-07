
/**
 * @author winter
 * @date 2019/4/7 13:36
 */
public class Solution02 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length ; i++) {
            if (prices[i] < minprice){
                minprice = prices[i];
            }else if(prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
