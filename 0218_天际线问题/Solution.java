
import java.util.*;

/**
 * @author winter
 * @date 2019/10/25 23:13
 */
public class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        TreeMap<Integer,List<int[]>> map = new TreeMap<>();
        for (int[] building : buildings) {
            map.putIfAbsent(building[0],new ArrayList<>());
            map.putIfAbsent(building[1],new ArrayList<>());
            // 存开始位置
            map.get(building[0]).add(building);
            // 存结束位置
            map.get(building[1]).add(building);
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->b[2]-a[2]);
        List<List<Integer>> res = new ArrayList<>();
        for(int a : map.keySet()){
             List<int[]> bs = map.get(a);
            for ( int[] b : bs) {
                if (b[0] == a){
                    // 如果是起始位置
                    maxHeap.add(b);
                }else {
                    // 如果是结束位置
                    maxHeap.remove(b);
                }
            }
            if (maxHeap.size() == 0){ // 处理结束的buiding也就是后面没有重叠的建筑了
                List<Integer> temp = new ArrayList<>();
                temp.add(a);
                temp.add(0);
                res.add(temp);
            }else { // 处理第一个building和中间的building
                int maxHeight = maxHeap.peek()[2];
                if (res.size() == 0 || maxHeight != res.get(res.size() -1).get(1)){
                    List<Integer> temp  = new ArrayList<>();
                    temp.add(a);
                    temp.add(maxHeight);
                    res.add(temp);
                }
            }
        }
        return res;
    }
}
