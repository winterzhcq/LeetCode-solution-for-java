
/**
 * @author winter
 * @date 2019/10/12 22:54
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A == null || A.length <= 1) return A;
        int i = 0,j=A.length-1;
        while (i < j) {
            while (i < j && A[i] % 2 == 0) i++;
            while (i < j && A[j] % 2 != 0) j--;
            if (i < j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = new int[]{3,1,2,4};
        System.out.println(solution.sortArrayByParity(a).toString());

    }
}
