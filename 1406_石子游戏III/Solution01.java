
/**
 * 逆向思维，该思维比较难理解
 * @author winter
 * @date 2020/4/8 22:38
 */
public class Solution01 {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n+1];
        int sum = 0;
        for(int i = stoneValue.length-1;i>=0;i--){
            sum += stoneValue[i];
            int minScore = 0;
            if(i + 2 < n + 1)
                minScore =  Math.min(dp[i+1], dp[i+2]);
            if(i + 3 < n + 1)
                minScore =  Math.min(minScore, dp[i+3]);
            dp[i] = sum - minScore;
        }
        if(dp[0] == sum - dp[0])  return "Tie";
        else if(dp[0] > sum - dp[0])  return "Alice";
        else return "Bob";
    }
}
