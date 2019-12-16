
/**
 * @author winter
 * @date 2019/12/16 22:18
 */
public class Solution01 {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int res = 0;
        while (n != 0){
            n = n & (n-1);
            res++;
        }
        return res;
    }
}
