
public class Solution {

    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs.length() % 5 != 0) return -1;
        int c = 0;
        int r = 0;
        int o = 0;
        int a = 0;
        int k = 0;
        int res = 0;
        for (char c1 : croakOfFrogs.toCharArray()){
            if (c1 == 'c') c++;
            if (c1 == 'r') r++;
            if (c1 == 'o') o++;
            if (c1 == 'a') a++;
            if (c1 == 'k') k++;
            res = Math.max(c-k,res);
            if(c>=r&&r>=o&&o>=a&&a>=k)
                continue;
            else return -1;
        }
        if (c == r && c==o && c==a && c==k){
            return res;
        }
        else return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minNumberOfFrogs("aoocrrackk");
    }
}
