package Tree.BST.question230;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.4 MB, 在所有 Java 提交中击败了23.79%的用户
 */
class Solution1 {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode curNode = root;
        int res = 0;
        while(!deque.isEmpty() || curNode != null){
            while(curNode != null){
                deque.addLast(curNode);
                curNode = curNode.left;
            }
            if(curNode == null){
                curNode = deque.removeLast();
                res++;
                if(res == k){
                    return curNode.val;
                }
                curNode = curNode.right;
            }
        }
        return -1;
    }
}
