package Acwing.SearchAndGraph.Dijkstra.question849;
import java.util.Scanner;

public class question849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];
        int[] dist = new int[n + 1];
        boolean[] st = new boolean[n + 1];

        // 初始化matrix矩阵
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                if(i == j){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int length = sc.nextInt();
            matrix[a][b] = Math.min(matrix[a][b], length);
        }

        System.out.println(dijkstra(matrix, dist, st, n));
    }

    public static int dijkstra(int[][] matrix, int[] dist, boolean[] st, int n){
        // 初始化dist数组
        for(int i = 0; i <= n; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[1] = 0;

        for(int i = 0; i <= n - 1; i++){

            // 当前不在集合s中的距离最近的点
            int t = -1;
            for(int j = 1; j <= n; j++){
                if(st[j] == false && (t == -1 || dist[j] < dist[t])){
                    t = j;
                }
            }

            for(int j = 1; j <= n; j++){
                if(matrix[t][j] == Integer.MAX_VALUE){
                    continue;
                }
                dist[j] = Math.min(dist[j], dist[t] + matrix[t][j]);
            }

            st[t] = true;
        }

        if(dist[n] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[n];
    }
}
