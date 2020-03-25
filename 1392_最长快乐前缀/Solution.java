class Solution {
   public String longestPrefix(String s) {
        int[] next = new int[s.length()];
        makeNext(s.toCharArray(),next);
        return s.substring(0,next[s.length()-1]);
    }
    void makeNext(char[] s,int[] next) {
        int len = s.length;
        next[0]=0;      
        for(int i=1,k=0;i<len;i++) {
            while(k>0 && s[k]!=s[i])  k=next[k-1];
            if(s[k]==s[i]) k++;     
            next[i]=k;             
        }
    }
}