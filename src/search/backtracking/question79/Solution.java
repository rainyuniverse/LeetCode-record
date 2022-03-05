package search.backtracking.question79;
//有点回溯感觉的DFS 感觉代码有点冗长
class Solution {
    public boolean exist(char[][] board, String word) {
        //使用循环的方式进行赋值，防止地址相同
        //使用copyBoard记录走过的值（走过一个地方会将该地方的值赋为0），但感觉使用一个0/1的visited矩阵会更好
        char[][] copyBoard = new char[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                copyBoard[i][j] = board[i][j];
            }
        }
        boolean res = false;
        if(word.length() == 0){
            return true;
        }
        char[] arr = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == arr[0]){
                    if(res == true || dfs(i, j, arr, 0, copyBoard, board) == true){
                        res = true;
                    }
                    for(int m = 0; m < board.length; m++){
                        for(int n = 0; n < board[0].length; n++){
                            copyBoard[m][n] = board[m][n];
                        }
                    }
                }
            }
        }
        return res;
    }

    private boolean dfs(int x, int y, char[] arr, int index, char[][] board, char[][] oriBoard){
        //递归出口
        if(index == arr.length){
            return true;
        }
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != arr[index]){
            return false;
        }
        board[x][y] = '0';
        boolean up = dfs(x - 1, y, arr, index + 1, board, oriBoard);
        boolean left = dfs(x, y - 1, arr, index + 1, board, oriBoard);
        boolean right = dfs(x, y + 1, arr, index + 1, board, oriBoard);
        boolean down = dfs(x + 1, y, arr, index +1, board, oriBoard);
        //这里的DFS借鉴了回溯的思想，在递归结束后撤销处理结果
        board[x][y] = oriBoard[x][y];
        if(up == true || left == true || right == true || down == true){
            return true;
        }else{
            return false;
        }
    }
}
