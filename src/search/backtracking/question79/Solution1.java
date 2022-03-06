package search.backtracking.question79;

import java.util.ArrayList;
import java.util.List;
//比较标准的回溯写法 但执行用时超过48% 不太理想
class Solution1 {
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0){
            return true;
        }
        //java传参时是传值还是传地址的问题 这里本来想设置一个boolean值 但是这样的话在调用方法时就只能传值了
        //一个解决方法时可以修改函数的返回值 将void修改为boolean或int
        List<Integer> res = new ArrayList<>();
        char[] arr = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(arr[0] == board[i][j]){
                    int[][] visited = new int[board.length][board[0].length];
                    visited[i][j] = 1;
                    backtracking(i, j, visited, 0, arr, board, res);
                    if(res.contains(1) == true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void backtracking(int x, int y, int[][] visited, int index, char[] arr, char[][] board, List<Integer> res){
        if(index == arr.length - 1){
            res.add(1);
            return;
        }
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length){
            return;
        }
        int[] dx = new int[]{-1, 0, 0, 1};
        int[] dy = new int[]{0, -1, 1, 0};
        for(int i = 0; i < 4; i++){
            //想写成类似剪枝的格式
            if(x + dx[i] < 0 || x + dx[i] >= board.length || y + dy[i] < 0 || y + dy[i] >= board[0].length){
                continue;
            }
            if(visited[x + dx[i]][y + dy[i]] == 1){
                continue;
            }
            //每次判断的是下一个数的值
            //所以在设置递归出口时的判断条件是index == arr.length - 1
            if(arr[index + 1] == board[x + dx[i]][y + dy[i]]){
                visited[x + dx[i]][y + dy[i]] = 1;
                backtracking(x + dx[i], y + dy[i], visited, index + 1, arr, board, res);
                visited[x + dx[i]][y + dy[i]] = 0;
            }
        }

    }
}
