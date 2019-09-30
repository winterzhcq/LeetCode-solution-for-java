import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author winter
 * @date 2019/9/30 22:04
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue()))
                return false;
            else set.add(entry.getValue());
        }
        return true;
    }
}
