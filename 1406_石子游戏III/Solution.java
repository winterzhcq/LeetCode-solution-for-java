
/**
 * 使用动态规划的思想，第0堆是先手必须拿的，倒推求出第0堆 能取得的最多分数，就是先手的最大分数。
 * @author winter
 * @date 2020/4/8 22:28
 */
class Solution {
    // 当做缓存使用，不然会超时
    private Integer[] memo;
    public String stoneGameIII(int[] stoneValue) {
        int result = help(stoneValue,0);
        if(result > 0) return "Alice";
        else if(result == 0) return "Tie";
        else return "Bob";
    }
    private int help(int[] stoneValue,int start){
        if(start >= stoneValue.length) return 0;
        if(memo[start] != null) return memo[start];
        int ans = stoneValue[start] - help(stoneValue,start + 1);
        if(start +1 < stoneValue.length)
            ans = Math.max(ans,stoneValue[start]+stoneValue[start+1]-help(stoneValue,start + 2));
        if(start +2 < stoneValue.length)
            ans = Math.max(ans,stoneValue[start]+stoneValue[start+1]+stoneValue[start+2]-help(stoneValue,start + 3));
        return memo[start] = ans;
    }
}