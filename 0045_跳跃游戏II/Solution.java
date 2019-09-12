
/**
 * @author winter
 * @date 2019/9/12 23:13
 */
public class Solution {
    public int jump(int[] A) {
        int jump = 0,cur = 0,curfast = 0;
        for (int i = 0; i < A.length - 1 ; i++) {
            curfast = Math.max(curfast,A[i]+i);
            if (i == cur){
                jump++;
                cur = curfast;
            }
        }
        return jump;
    }
}
