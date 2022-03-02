package search.DFS.question695;

import java.util.ArrayDeque;
import java.util.Deque;
//臭到不行的BFS 不知道改了多少遍 时间和空间复杂度也不太理想
class Solution {
    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static class oneNode{
        int x;
        int y;
        int sum;

        public oneNode(int x, int y, int sum){
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int count = 0;
        Deque<Node> queue = new ArrayDeque<>();
        Node initNode = new Node(0,0);
        queue.addFirst(initNode);

        if(grid.length == 1 && grid[0].length == 1 && grid[0][0] == 1){
            return 1;
        }

        //建立访问矩阵 防止节点被重复访问
        int[][] visited = new int[grid.length][grid[0].length];
        //visited[0][0] = 1;

        int[] dx = new int[]{-1,0,0,1};
        int[] dy = new int[]{0,-1,1,0};

        while(queue.isEmpty() != true){
            Node curNode = queue.removeLast();
            int curx = curNode.x;
            int cury = curNode.y;
            for(int i = 0; i < 4; i++){
                int nextx = curx + dx[i];
                int nexty = cury + dy[i];
                if(nextx <= grid.length - 1 && nextx >= 0 && nexty <= grid[0].length - 1 && nexty >= 0 && visited[nextx][nexty] != 1){
                    Node nextNode = new Node(nextx, nexty);
                    queue.addFirst(nextNode);
                    visited[nextx][nexty] = 1;
                    if(grid[nextx][nexty] == 1){
                        //从某一个1开始出发进行遍历
                        Deque<oneNode> oneNodes = new ArrayDeque<>();
                        oneNode initOneNode = new oneNode(nextx,nexty,1);
                        oneNodes.addFirst(initOneNode);
                        count = 1;
                        int[][] oneVisited = new int[grid.length][grid[0].length];
                        oneVisited[nextx][nexty] = 1;

                        while(oneNodes.isEmpty() != true){
                            oneNode curOneNode = oneNodes.removeLast();
                            int curOnex = curOneNode.x;
                            int curOney = curOneNode.y;
                            int curOneSum = curOneNode.sum;
                            for(int j = 0; j < 4; j++){
                                int nextOnex = curOnex + dx[j];
                                int nextOney = curOney + dy[j];
                                if(nextOnex <= grid.length - 1 && nextOnex >= 0 && nextOney <= grid[0].length - 1 && nextOney >= 0 && oneVisited[nextOnex][nextOney] != 1){
                                    if(grid[nextOnex][nextOney] == 1){
                                        int nextOneSum = curOneSum + 1;
                                        oneNode nextOneNode = new oneNode(nextOnex,nextOney,nextOneSum);
                                        oneNodes.addFirst(nextOneNode);
                                        oneVisited[nextOnex][nextOney] = 1;
                                        count++;
                                    }
//                                    visited[nextOnex][nextOney] = 1;
                                }
                            }
                        }
                    }
                    if(res < count){
                        res = count;
                    }
                }
            }
        }

        return res;
    }
}
