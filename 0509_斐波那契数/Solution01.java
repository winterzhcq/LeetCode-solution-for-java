
/**
 * @author winter
 * @date 2020/1/17 23:08
 */
public class Solution {
    public int fib(int N) {
        int f3 ;
        if (N <= 1) return N;
        else {
            int f1 = 0;
            int f2 = 1;
            f3 = f1 + f2;
            for (int i = 2; i <= N; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
        }
        return f3;
    }
}
