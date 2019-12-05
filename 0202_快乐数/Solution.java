
import java.util.HashSet;
import java.util.Set;

/** Hash存储
 * @author winter
 * @date 2019/12/5 21:11
 */
public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int squareSum, remain;
        while (set.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n % 10;
                squareSum += remain * remain;
                n = n / 10;
            }
            if (squareSum == 1) return true;
            else n = squareSum;
        }
        return false;
    }

}
