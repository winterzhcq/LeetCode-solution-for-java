
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] getFolderNames(String[] names) {

        Map<String, Integer> map = new HashMap<>();
        String[] res = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            if (map.get(names[i]) == null) {
                res[i] = names[i];
                map.put(names[i], 0);
            } else if (map.get(names[i]) != null) {
                int count = map.get(names[i]) + 1;
                String tmp = names[i] + "(" + count + ")";

                while (map.get(tmp) != null) {
                    tmp = names[i] + "(" + ++count + ")";
                }

                res[i] = tmp;
                map.put(names[i], map.get(names[i]) + 1);
                map.put(res[i], 0);
            }
        }

        return res;
    }

}
