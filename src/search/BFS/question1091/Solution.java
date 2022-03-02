package search.BFS.question1091;

import java.util.ArrayDeque;
import java.util.Deque;
//BFS
class Solution {
    static class Node{
        int x;
        int y;
        int step;

        public Node(int x, int y, int step){
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        //ArrayDeque双端队列
        //addFirst() -在ArrayDeque双端队列的开头，插入指定的元素
        //addLast() - 在ArrayDeque双端队列的末尾插入指定的内容（等效于add()）
        //removeFirst() - 返回并从ArrayDeque双端队列中删除第一个元素（等效于remove()）
        //removeLast() - 返回并从ArrayDeque双端队列中删除最后一个元素
        Deque<Node> queue = new ArrayDeque<>();
        Node initNode = new Node(0,0,1);
        queue.addFirst(initNode);

        int length = grid.length - 1;
        int[] dx = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] dy = new int[]{-1,0,1,-1,1,-1,0,1};

        if(grid[0][0] == 1 || grid[length][length] == 1){
            return -1;
        }
        if(length == 0){
            return 1;
        }


        while (queue.isEmpty() != true){
            Node curNode = queue.removeLast();
            int curx = curNode.x;
            int cury = curNode.y;
            int curStep = curNode.step;
            for(int i = 0; i < 8; i++){
                int nextx = curx + dx[i];
                int nexty = cury + dy[i];
                if(nextx >= 0 && nextx <= length && nexty >= 0 && nexty <= length && grid[nextx][nexty] == 0){
                    if(nextx == length && nexty == length){
                        return curStep + 1;
                    }
                    Node nextNode = new Node(nextx, nexty, curStep + 1);
                    queue.addFirst(nextNode);
                    //将走过的地方修改为1 防止重复
                    grid[nextx][nexty] = 1;
                }
            }
        }
        return -1;
    }
}
