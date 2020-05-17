
import java.util.*;

public class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            List<String> checkOne = favoriteCompanies.get(i);
            boolean flag = true;
            for (int j = 0; j < favoriteCompanies.size(); j++) {
                if (j == i) continue;
                List<String> second = favoriteCompanies.get(j);
                Set<String> tmpSecond = new HashSet<>(second);
                if (tmpSecond.containsAll(checkOne)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
//        [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
        Solution solution = new Solution();
        List<String> list1 = new ArrayList<>();
        list1.add("leetcode");
        list1.add("google");
        list1.add("facebook");
        lists.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("google");
        list2.add("microsoft");
        lists.add(list2);
        List<String> list3 = new ArrayList<>();
        list3.add("google");
        list3.add("facebook");
        lists.add(list3);
        List<String> list4 = new ArrayList<>();
        list2.add("google");
        lists.add(list4);
        List<String> list5 = new ArrayList<>();
        list2.add("amazon");
        lists.add(list5);
        solution.peopleIndexes(lists);
    }
}
