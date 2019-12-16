
/**
 * @author winter
 * @date 2019/12/16 22:10
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.hammingDistance(1,4);
    }
}
