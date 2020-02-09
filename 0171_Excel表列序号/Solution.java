class Solution {
    public int titleToNumber(String s) {
        int temp = 0;
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            temp = temp*26 + (c[i]-'A'+1);
        }
        return temp;
    }
}