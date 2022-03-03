package search.DFS.question200;
//递归实现DFS
class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        int[][] copyGrid = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                copyGrid[i][j] = (int)grid[i][j] - 48;
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(copyGrid[i][j] == 1){
                    res++;
                    dfs(i, j, copyGrid);
                }
            }
        }

        return res;
    }

    private int dfs(int x, int y, int[][] grid){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0){
            return 0;
        }
        grid[x][y] = 0;
        dfs(x - 1, y, grid);
        dfs(x, y - 1, grid);
        dfs(x, y + 1, grid);
        dfs(x + 1, y, grid);
        return 0;
    }
}
