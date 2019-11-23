
/**
 * @author winter
 * @date 2019/11/23 22:25
 */
public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.defangIPaddr("1.1.1.1"));
    }
}
