package search.DFS.question547;
//DFS复杂版
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int res = 0;
        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected.length; j++){
                if(isConnected[i][j] == 1){
                    res++;
                    dfs(i,j,isConnected);
                }
            }
        }
        return res;
    }

    private int dfs(int x, int y, int[][] isConnected){
        if(x < 0 || x >= isConnected.length || y < 0 || y >= isConnected.length || isConnected[x][y] == 0){
            return 0;
        }
        isConnected[x][y] = 0;
        dfs(x - 1, y, isConnected);
        dfs(x, y - 1, isConnected);
        dfs(x, y + 1, isConnected);
        dfs(x + 1, y, isConnected);
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[x][i] == 1){
                isConnected[x][i] = 0;
                isConnected[i][y] = 0;
                dfs(i, i, isConnected);
            }
        }
        return 0;
    }
}
