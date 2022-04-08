package Graph.question743;

public class question743 {
    public static void main(String[] args) {
        int[][] times = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        Solution solution = new Solution();
        System.out.println(solution.networkDelayTime(times, 4, 2));
    }
}
