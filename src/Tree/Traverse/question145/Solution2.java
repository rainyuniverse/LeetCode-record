package Tree.Traverse.question145;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// 非递归 用栈实现翻转
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.5 MB, 在所有 Java 提交中击败了44.24%的用户
 */
class Solution2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> resStack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curNode = stack.pop();
            resStack.push(curNode.val);
            if(curNode.left != null){
                stack.push(curNode.left);
            }
            if(curNode.right != null){
                stack.push(curNode.right);
            }
        }

        while(!resStack.isEmpty()){
            res.add(resStack.pop());
        }
        return res;
    }
}
