package Tree.BST.question530;

import Tree.TreeNode;

import java.util.Stack;
// 中序遍历
/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了20.21%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了27.63%的用户
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        int preVal = -1;
        int res = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;
        while(!stack.isEmpty() || curNode != null){
            if(curNode != null){
                stack.push(curNode);
                curNode = curNode.left;
            }else{
                curNode = stack.pop();
                if(preVal != -1){
                    res = Math.min(res, Math.abs(preVal - curNode.val));
                    if(res == 1){
                        return 1;
                    }
                }
                preVal = curNode.val;
                curNode = curNode.right;
            }
        }
        return res;
    }
}
