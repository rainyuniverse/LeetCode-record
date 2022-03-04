package search.DFS.question130;
//DFS简化版
class Solution1 {
    public void solve(char[][] board) {
        for(int i = 0; i < board[0].length; i++){
            if(board[0][i] == 'O'){
                dfs(0, i, board);
            }
            if(board[board.length - 1][i] == 'O'){
                dfs(board.length - 1, i, board);
            }
        }
        for(int i = 0; i < board.length; i++){
            if(board[i][0] == 'O'){
                dfs(i, 0, board);
            }
            if(board[i][board[0].length - 1] == 'O'){
                dfs(i, board[0].length - 1, board);
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(int x, int y, char[][] board){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 'X' || board[x][y] == 'A'){
            return;
        }
        board[x][y] = 'A';
        dfs(x - 1, y, board);
        dfs(x, y - 1, board);
        dfs(x, y + 1, board);
        dfs(x + 1, y, board);
        return;
    }
}
