package Graph.question743;

/**
 * 执行用时：3 ms, 在所有 Java 提交中击败了90.52%的用户
 * 内存消耗：44.4 MB, 在所有 Java 提交中击败了65.86%的用户
 */
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] matrix = new int[n + 1][n + 1];
        int[] dist = new int[n + 1];
        boolean[] st = new boolean[n + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                if(i == j){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for(int i = 0; i < times.length; i++){
            int a = times[i][0];
            int b = times[i][1];
            int length = times[i][2];
            matrix[a][b] = length;
        }

        int[] output = dijkstra(matrix, dist, st, n, k);
        int res = 0;
        for(int i = 1; i <= n; i++){
            if(output[i] == Integer.MAX_VALUE){
                return -1;
            }else{
                res = Math.max(res, output[i]);
            }
        }
        return res;
    }

    public int[] dijkstra(int[][] matrix, int[] dist, boolean[] st, int n, int k){
        for(int i = 1; i <= n; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;

        for(int i = 0; i <= n - 1; i++){

            int t = -1;
            for(int j = 1; j <= n; j++){
                if(!st[j] && (t == -1 || dist[j] < dist[t])){
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
        return dist;
    }
}
