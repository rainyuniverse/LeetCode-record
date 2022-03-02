package search.BFS.question279;

import java.util.ArrayDeque;
import java.util.Deque;
//BFS 但执行用时和内存消耗都不太行 还有动态规划的方法和数学的方法
class Solution {
    static class Node{
        int value;
        int step;

        public Node(int value, int step){
            this.value = value;
            this.step = step;
        }
    }
    public int numSquares(int n) {
        Deque<Node> queue = new ArrayDeque<>();
        Node initNode = new Node(0,0);
        queue.addFirst(initNode);

        while(queue.isEmpty() != true){
            Node curNode = queue.removeLast();
            int curValue = curNode.value;
            int curStep = curNode.step;
            for(int i = 0; ;i++){
                if(curValue + i*i < n){
                    int nextValue = curValue + i*i;
                    int nextStep = curStep + 1;
                    Node nextNode = new Node(nextValue, nextStep);
                    queue.addFirst(nextNode);
                }else if(curValue + i*i == n){
                    return curStep + 1;
                }else if(curValue + i*i > n){
                    break;
                }
            }
        }
        return -1;
    }
}


//从 0 到 n 有 n+1 个整数，把这 n+1 个整数看做是节点。如果两个节点之间的差是一个完全平方数，我们就说这两个节点之间是有连接的。通过这个思路我们就可以建立一张图。
//找到 n 到 0 的最短路径，我们就找到了 n 至少需要几个完全平方数组成。
