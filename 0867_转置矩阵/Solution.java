class Solution {
    public int[][] transpose(int[][] A) {
        int a = A.length;
        int b = A[0].length;
        int[][] result = new int[b][a];
        for(int i = 0;i<a;i++){
            for(int j = 0;j<b;j++){
                result[j][i] = A[i][j];
            }
        }
        return result ;
    }
}