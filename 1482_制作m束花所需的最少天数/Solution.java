
public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length) return -1;
        int max = bloomDay[0];
        for (int i = 1;i<bloomDay.length;i++) {
            max = Math.max(bloomDay[i],max);
        }

        int min = 0;
        while (min < max){
            int mid = min+(max-min)/2;
            int res = help(bloomDay,mid,k);
            if (res >= m) max=mid;
            else min = mid+1;
        }

        return min;
    }

    private int help(int[] bloomDay, int mid, int k) {
        int res  = 0;
        int count=0;
        for (int i = 0;i<bloomDay.length;i++){
            if (bloomDay[i]<=mid) count++;
            else count =0;
            if (count == k){
                res++;
                count=0;
            }
        }
        return res;
    }
}
