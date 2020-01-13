class Solution01 {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.length() == 0) return true;
        int[] cnt = new int[26];
        for(char c : moves.toCharArray()) cnt[c-'A']++;
        return cnt['L'-'A']==cnt['R'-'A'] && cnt['U'-'A']==cnt['D'-'A'];
    }
}