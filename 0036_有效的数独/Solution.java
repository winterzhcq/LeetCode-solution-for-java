class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] rows = new HashMap[9];
        HashMap<Integer,Integer>[] coloums = new HashMap[9];
        HashMap<Integer,Integer>[] boxes = new HashMap[9];
        for(int i = 0;i < 9;i++){
            rows[i] = new HashMap<>();
            coloums[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }
        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                char num = board[i][j];
                if(num != '.'){
                    int n = (int)num;
                    int boxIndex = (i/3)*3 + j/3;
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                    coloums[j].put(n,coloums[j].getOrDefault(n,0)+1);
                    boxes[boxIndex].put(n,boxes[boxIndex].getOrDefault(n,0)+1);
                    if(rows[i].get(n) > 1 || coloums[j].get(n) >1 || boxes[boxIndex].get(n) > 1)
                        return false;
                }
            }
        }
        return true;
    }
}