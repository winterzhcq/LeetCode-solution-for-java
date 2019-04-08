
/**
 * @author winter
 * @date 2019/4/8 14:13
 */
public class Solution {
    public int numTrees(int n) {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        int res = 0;
        for (int i = 1; i <= n; i++)
        {
            res += numTrees(i - 1) * numTrees(n - i);
        }
        return res;
    }

}
