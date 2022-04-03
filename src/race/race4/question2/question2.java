package race.race4.question2;

import java.util.List;

public class question2 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 5}, {2, 5}, {2, 8}, {2, 9}, {3, 8}, {4, 7}, {4, 9}, {5, 7}, {6, 8}};
        Solution solution = new Solution();
        List<List<Integer>> output = solution.findWinners(arr);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
