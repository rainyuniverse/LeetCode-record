package Tree.HierarchicalTraversal.question513;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了68.59%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了8.51%的用户
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        int res = 0;
        deque.addLast(root);
        while(!deque.isEmpty()){
            int len = deque.size();
            for(int i = 0; i < len; i++){
                TreeNode curNode = deque.removeFirst();
                if(i == 0){
                    res = curNode.val;
                }
                if(curNode.left != null){
                    deque.addLast(curNode.left);
                }
                if(curNode.right != null){
                    deque.addLast(curNode.right);
                }
            }
        }
        return res;
    }
}
