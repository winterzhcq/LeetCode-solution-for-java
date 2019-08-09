class Solution {
 public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        if(g == null || g.length == 0 || s == null || s.length == 0)
            return res;
        Arrays.sort(g);
        Arrays.sort(s);
        int l = s.length -1;
        for (int i = g.length-1; i >=0 ; i--) {
            for ( int j = l ; j >=0 ; j--) {
                if (s[j] >= g[i]){
                    l--;
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}