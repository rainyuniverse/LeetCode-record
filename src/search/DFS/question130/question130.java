package search.DFS.question130;

public class question130 {
    public static void main(String[] args){
//        char[][] board = new char[][]{
//                {'X', 'X', 'X', 'X'},
//                {'X', 'O', 'O', 'X'},
//                {'X', 'X', 'O', 'X'},
//                {'X', 'O', 'X', 'X'}};
        char[][] board = new char[][]{
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'}
        };
        Solution solution = new Solution();
        solution.solve(board);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
