
/**
 * @author winter
 * @date 2019/9/7 22:46
 */
public class Solution {
    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++)
            while (num % i == 0)
                num /= i;
        return num == 1;
    }
}
