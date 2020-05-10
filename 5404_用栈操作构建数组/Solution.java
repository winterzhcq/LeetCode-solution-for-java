
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new LinkedList<>();
        int j = 0;
        for (int i = 1; i <= n; i++){
            if (j >= target.length) return list;
            list.add("Push");
            if (target[j] == i)  {
                j++;
            }else {
                list.add("Pop");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.buildArray(new int[]{1,2},4);
    }
}
