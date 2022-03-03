package search.DFS.question200;

import java.util.ArrayDeque;
import java.util.Deque;
//BFS
class Solution1 {
    class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int numIslands(char[][] grid) {
        int res = 0;
        int[][] copyGrid = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                copyGrid[i][j] = (int)grid[i][j] - 48;
            }
        }

        int[] dx = new int[]{-1,0,0,1};
        int[] dy = new int[]{0,-1,1,0};

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(copyGrid[i][j] == 1){
                    res++;
                    Deque<Node> queue = new ArrayDeque<>();
                    Node initNode = new Node(i,j);
                    queue.addLast(initNode);
                    copyGrid[i][j] = 0;

                    while(queue.isEmpty() != true){
                        Node curNode = queue.removeFirst();
                        int curx = curNode.x;
                        int cury = curNode.y;
                        for(int m = 0; m < 4; m++){
                            int nextx = curx + dx[m];
                            int nexty = cury + dy[m];
                            if(nextx >= 0 && nextx < grid.length && nexty >= 0 && nexty < grid[0].length && copyGrid[nextx][nexty] == 1){
                                Node nextNode = new Node(nextx, nexty);
                                queue.addLast(nextNode);
                                copyGrid[nextx][nexty] = 0;
                            }
                        }
                    }

                }
            }
        }
        return res;
    }
}
