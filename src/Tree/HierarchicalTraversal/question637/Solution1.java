package Tree.HierarchicalTraversal.question637;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了94.64%的用户
 * 内存消耗：42.3 MB, 在所有 Java 提交中击败了66.66%的用户
 */
public class Solution1 {
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Double> res = new ArrayList<>();
        deque.addLast(root);
        while(!deque.isEmpty()){
            double curNum = deque.size();
            double curSum = 0;
            for(int i = 0; i < curNum; i++){
                TreeNode curNode = deque.removeFirst();
                curSum = curSum + curNode.val;
                if(curNode.left != null){
                    deque.addLast(curNode.left);
                }
                if(curNode.right != null){
                    deque.addLast(curNode.right);
                }
            }
            res.add(curSum / curNum);
        }
        return res;
    }
}
