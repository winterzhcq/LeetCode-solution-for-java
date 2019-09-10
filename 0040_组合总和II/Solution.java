
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author winter
 * @date 2019/9/10 23:03
 */
public class Solution {
    private List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return lists;
        }
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        process(0, candidates, target, list);
        return lists;
    }

    private void process(int start, int[] candidates, int target, List<Integer> list) {
        if (target < 0)
            return;
        if (target == 0)
            lists.add(new ArrayList<>(list));
        else {
            for (int i = start; i < candidates.length ; i++) {
                // 去重
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                list.add(candidates[i]);
                process(i+1,candidates,target - candidates[i],list);
                // 逐个遍历
                list.remove(list.size() - 1);
            }
        }
    }
}
