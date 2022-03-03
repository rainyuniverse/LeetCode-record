package search.DFS.question695;
//DFS
class Solution1 {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        }
        return res;
    }

    public int dfs(int i, int j, int[][] grid){
        //如果碰到非岛屿的状况，则直接返回0
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        int num = 1;
        //使用沉岛思想，每次找到岛屿，则把找到的岛屿变为0，防止重复
        grid[i][j] = 0;
        num = num + dfs(i - 1, j, grid);
        num = num + dfs(i, j - 1, grid);
        num = num + dfs(i, j + 1, grid);
        num = num + dfs(i + 1, j, grid);

        return num;
    }
}
