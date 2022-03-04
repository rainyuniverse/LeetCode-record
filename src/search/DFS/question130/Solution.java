package search.DFS.question130;
//两次DFS
class Solution {
    public void solve(char[][] board) {
        int flag;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    int[][] visited = new int[board.length][board[0].length];
                    flag = dfs(i, j, board, visited);
                    if(flag == 0){
                        dfsFill(i, j, board);
                    }
                }
            }
        }
    }

    private int dfs(int x, int y, char[][] board, int[][] visited){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 'X' || visited[x][y] == 1){
            return 0;
        }
        visited[x][y] = 1;
        if(x == 0 || x == board.length - 1 || y == 0 || y == board[0].length - 1){
            if(board[x][y] == 'O'){
                return 1;
            }
        }
        int up = dfs(x - 1, y, board, visited);
        int left = dfs(x, y - 1, board, visited);
        int right = dfs(x, y + 1, board, visited);
        int down = dfs(x + 1, y, board, visited);
        if(up == 1 || left == 1 || right == 1 || down == 1){
            return 1;
        }else{
            return 0;
        }
    }

    private void dfsFill(int x, int y, char[][] board){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 'X'){
            return;
        }
        board[x][y] = 'X';
        dfsFill(x - 1, y, board);
        dfsFill(x, y - 1, board);
        dfsFill(x, y + 1, board);
        dfsFill(x + 1, y, board);
        return;
    }
}
