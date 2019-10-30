
import java.util.*;

/**
 * @author winter
 * @date 2019/10/30 21:39
 */
public class Solution {
    Map<String, String> phone = new HashMap<String, String>(){
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }
    };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return res;
        return helper(digits);
    }

    private List<String>  helper(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 1){
            List<String> list = new ArrayList<>();
            for(int i = 0;i < phone.get(digits).length();i++){
                list.add(String.valueOf(phone.get(digits).charAt(i)));
            }
            return list;
        }else {
             String temp = digits.substring(0, 1);
             List<String> helper = helper(digits.substring(1));
            for(int i = 0;i < phone.get(temp).length();i++){
                for (int j = 0; j < helper.size() ; j++) {
                    String s = phone.get(temp).charAt(i) + helper.get(j);
                     result.add(s);
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution= new Solution();
        final List<String> list = solution.letterCombinations("23");
        System.out.println(Arrays.toString(new List[]{list}));

    }
}
