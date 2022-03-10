package DP.MatrixPath.question64;

import java.util.ArrayDeque;
import java.util.Deque;
//BFS

/**
 * 执行用时：5 ms, 在所有 Java 提交中击败了30.50%的用户
 * 内存消耗：43.9 MB, 在所有 Java 提交中击败了28.63%的用户
 */
class Solution {
    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int minPathSum(int[][] grid) {
        //注意方向数组的设置，每次只能向下或向右
        int[] dx = new int[]{0, 1};
        int[] dy = new int[]{1, 0};
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                visited[i][j] = -1;
            }
        }

        Node initNode = new Node(0,0);
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(initNode);
        visited[0][0] = grid[0][0];

        while(queue.isEmpty() != true){
            Node curNode = queue.removeFirst();
            int curx = curNode.x;
            int cury = curNode.y;
            for(int i = 0; i < 2; i++){
                int nextx = curx + dx[i];
                int nexty = cury + dy[i];
                if(nextx >= 0 && nextx < grid.length && nexty >= 0 && nexty < grid[0].length){
                    if(visited[curx][cury] + grid[nextx][nexty] < visited[nextx][nexty] || visited[nextx][nexty] == -1){
                        visited[nextx][nexty] = visited[curx][cury] + grid[nextx][nexty];
                        Node nextNode = new Node(nextx, nexty);
                        queue.addLast(nextNode);
                    }
                }
            }

        }
        return visited[grid.length - 1][grid[0].length - 1];
    }
}
