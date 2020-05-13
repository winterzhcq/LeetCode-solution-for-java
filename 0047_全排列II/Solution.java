
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> arrangement = new LinkedList<>();
        Arrays.sort(nums);
        decisionTree(arrangement,new boolean[nums.length], nums);
        return result;
    }

    private void decisionTree(LinkedList<Integer> arrangement,boolean[] visited, int[] nums) {
        if (arrangement.size() == nums.length) {
            result.add(new LinkedList<>(arrangement)); //一个深浅拷贝问题
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && visited[i-1]) continue;
            arrangement.add(nums[i]);
            System.out.println(nums[i]);
            visited[i] = true;
            decisionTree(arrangement, visited,nums);
            arrangement.removeLast();
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.permuteUnique(new int[]{1,1,2});
    }
}
