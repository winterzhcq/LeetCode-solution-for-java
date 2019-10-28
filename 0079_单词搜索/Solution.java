
/**
 * @author winter
 * @date 2019/10/28 23:09
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean res = exit(board,i,j,word,0);
                if(res) return true;
            }
        }
        return false;
    }

    private boolean exit(char[][] board,int i,int j,String word,int start){
        if(start >= word.length()) return true;
        if( i < 0 || i >= board.length || j < 0 ||
                j >= board[0].length || board[i][j] != word.charAt(start) ) return false;
        char c = board[i][j];
        board[i][j] = '#';
        boolean res = (exit(board,i+1,j,word,start+1) || exit(board,i-1,j,word,start+1)
                || exit(board,i,j+1,word,start+1) || exit(board,i,j-1,word,start+1));
        board[i][j] = c;
        return res;
    }
}
