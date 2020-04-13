class Solution {
  public int[] processQueries(int[] queries, int m) {
        int[] result = new int[queries.length];
        int[] p = new int[m];
        for(int i = 0 ;i< p.length;i++) p[i] = i+1;
        for (int i = 0;i<queries.length;i++){
            int temp = queries[i];
           for(int j = p.length-1; j>=0;j--){
               if (p[j] == temp){
                   result[i] = j;
                   for(int k = j;k>0;k--)p[k] = p[k-1];
                   break;
               }
           }
           p[0] = temp;
        }
        return result;
    }
}