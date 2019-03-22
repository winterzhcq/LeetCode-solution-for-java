
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author winter
 * @date 2019/3/22 20:33
 */

 class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
  }
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n ; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        //排序
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval> list = new ArrayList<>();
        for (int i = 0,j = 0; i < n ; i++) {
            //如果找不到重复集合，就存在List数组
            if (i == n-1 || start[i+1] > end[i]){
                list.add(new Interval(start[j],end[i]));
                //记录下一个区间的开始位置
                j = i+1;
            }
        }
        return list;
    }
}
