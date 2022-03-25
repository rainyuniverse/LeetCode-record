package Tree.HierarchicalTraversal.question637;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 执行用时：3 ms, 在所有 Java 提交中击败了27.04%的用户
 * 内存消耗：42.4 MB, 在所有 Java 提交中击败了63.81%的用户
 */
class Solution {
    class modiNode{
        TreeNode treeNode;
        int count;

        modiNode(TreeNode treeNode, int count){
            this.treeNode = treeNode;
            this.count = count;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<modiNode> deque = new ArrayDeque<>();
        deque.addLast(new modiNode(root, 0));
        List<Double> arr = new ArrayList<>();
        int flag = 0;
        double curSum = 0;
        double curNum = 0;
        while(!deque.isEmpty()){
            modiNode curModiNode = deque.removeFirst();
            TreeNode curNode = curModiNode.treeNode;
            int curCount = curModiNode.count;
            if(curCount == flag){
                curSum = curSum + curNode.val;
                curNum = curNum + 1;
            }
            if(curCount > flag){
                arr.add(curSum / curNum);
                flag = curCount;
                curSum = 0;
                curNum = 0;
                curSum = curSum + curNode.val;
                curNum = curNum + 1;
            }
            if(curNode.left != null){
                deque.addLast(new modiNode(curNode.left, curCount + 1));
            }
            if(curNode.right != null){
                deque.addLast(new modiNode(curNode.right, curCount + 1));
            }
        }
        arr.add(curSum / curNum);
        return arr;
    }
}
