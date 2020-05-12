
import java.util.LinkedList;
import java.util.List;

public class Solution01 {
    /**
     * 全排列是一种决策树问题
     * 1、路径：也就是已经做出的选择。
     *
     * 2、选择列表：也就是你当前可以做的选择。
     *
     * 3、结束条件：也就是到达决策树底层，无法再做选择的条件。
     *
     * 决策树的算法框架
     * @param nums
     * result = []
     * def backtrack(路径, 选择列表):
     *     if 满足结束条件:
     *         result.add(路径)
     *         return
     *
     *     for 选择 in 选择列表:
     *         做选择
     *         backtrack(路径, 选择列表)
     *         撤销选择
     * @return
     */
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> arrangement = new LinkedList<>();
        decisionTree(arrangement,nums);
        return result;
    }

    private void decisionTree(LinkedList<Integer> arrangement, int[] nums) {
        if (arrangement.size() == nums.length){
            result.add(new LinkedList<>(arrangement));
            return;
        }
        for (int num : nums){
            if (arrangement.contains(num)) continue;
            arrangement.add(num);
            decisionTree(arrangement,nums);
            arrangement.removeLast();
        }
    }
}
