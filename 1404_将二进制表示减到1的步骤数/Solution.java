class Solution {
    public int numSteps(String s) {
        char[] chars=s.toCharArray();
        int r=chars.length-1;
        int step=0;
        while(r>=1){
            if(chars[r]=='0'){
                step+=1;
                if(--r==0) return step;
            }else {
                step++;
                while (r>=0&&chars[r]=='1'){
                    step++;
                    r--;
                }
                if(r<0) return step;
                chars[r]='1';
            }
        }
        return step;
    }
}