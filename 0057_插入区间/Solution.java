
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author winter
 * @date 2019/3/23 12:45
 */

//Definition for an interval.
   class Interval {
     int start;
     int end;
    Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
  }

public class Solution {
    /**
     * 和56题类似，首先对排序，然后找到交叉区域，最后合并
     * @param intervals
     * @param newInterval
     * @return
     */
       public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int n = intervals.size();
        int start[] = new int[n+1];
        int end[] = new int[n+1];
        for (int i = 0; i < n ; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        start[n] = newInterval.start;
        end[n] = newInterval.end;
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval> list = new ArrayList<>();
        for (int i = 0 ,j=0; i <= n; i++) {
            if(i == n || start[i+1]>end[i]){
                list.add(new Interval(start[j],end[i]));
                j = i+1;
            }
        }
        return list;
    }
}
