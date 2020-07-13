
import java.util.*;

public class Solution {
    public int[] avoidFlood(int[] rains) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[rains.length];
        Arrays.fill(ans, 1);
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) {
                if (map.containsKey(rains[i])) {
                    int tempIndex = 0;
                    if ((tempIndex = hasSolution(list, map.get(rains[i]))) < 0) return new int[0];
                    else {
                        ans[tempIndex] = rains[i];
                        map.put(rains[i], i);
                        ans[i] = -1;
                    }
                } else {
                    map.put(rains[i], i);
                    ans[i] = -1;
                }
            } else {
                list.add(i);
            }
        }
        return ans;
    }

    private int hasSolution(List candidates, int index) {
        if (candidates.size() == 0) return -1;
        ListIterator iterator = candidates.listIterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i > index) {
                iterator.remove();
                return i;
            }
        }
        return -1;
    }

}
