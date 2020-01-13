class Solution {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.length() == 0) return true;
        int x =0, y = 0;
        for(int i = 0;i < moves.length();i++){
            if(moves.charAt(i) == 'L') x--;
            else if(moves.charAt(i) == 'R') x++;
            else if(moves.charAt(i) == 'U') y++;
            else if(moves.charAt(i) == 'D') y--;
        }
        return x == y  && x == 0;
    }
}