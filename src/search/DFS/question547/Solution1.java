package search.DFS.question547;
//DFS简化版 参考官方题解方法一
class Solution1 {
    public int findCircleNum(int[][] isConnected) {
        int res = 0;
        int[] visited = new int[isConnected.length];
        for(int i = 0; i < isConnected.length; i++){
            if(visited[i] == 0){
                res++;
                dfs(visited, isConnected, i);
            }
        }
        return res;
    }

    private int dfs(int[] visited, int[][] isConnected, int i){
        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j] == 1 && visited[j] != 1){
                visited[j] = 1;
                dfs(visited, isConnected, j);
            }
        }
        return 0;
    }
}
