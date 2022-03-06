package search.backtracking.question79;

public class question79 {
    public static void main(String[] args){
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'}
        };
//        char[][] board = new char[][]{
//                {'C', 'A', 'A'},
//                {'A', 'A', 'A'},
//                {'B', 'C', 'D'}
//        };
        String word = "ABCB";
        Solution solution = new Solution();
//        System.out.println(solution.exist(board, word));
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.exist(board, word));
    }
}
