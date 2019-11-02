
/**
 * @author winter
 * @date 2019/11/2 22:10
 */
class Solution {
    int result,path = 1,startX,startY,endX,endY;
    public int uniquePathsIII(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 0) path++;
                else if(grid[i][j] == 1){
                    startX = i;
                    startY = j;
                }else if(grid[i][j] == 2){
                    endX = i;
                    endY = j;
                }
            }
        }
        dfs(grid,startX,startY);
        return result;
    }
    private void dfs(int[][] grid,int x,int y){
        // 越界处理
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] < 0)
            return;
        if(x == endX && y == endY){
            if(path == 0) result++;
            return;
        }
        grid[x][y] = -2;
        path--;
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
        grid[x][y] = 0;
        path++;
    }
}
