
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/2/17 10:27
 */
public class Solution {
    /**
     * 当n=0是，结果是[0],当n=1时，结果是[00][01],当n=2时，结果是[000][010][110][100]
     * 很容易发现其规律当n=2是在n=1的基础上最高位分别添加了0或1，为了保证两个连续的数值仅有一个位数的差异。
     * 所以我们逆序添加
     * @param n
     * @return
     */
    public List<Integer> grayCode(int n) {
        List<Integer> rs= new ArrayList<>();
        rs.add(0);
        for(int i=0;i<n;i++){
            int size=rs.size();
            for(int k=size-1;k>=0;k--)
                rs.add(rs.get(k) | 1<<i);
        }
        return rs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> lis = solution.grayCode(3);
        System.out.println(lis.toString());
    }
}
