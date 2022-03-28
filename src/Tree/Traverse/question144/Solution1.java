package Tree.Traverse.question144;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// 非递归
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.7 MB, 在所有 Java 提交中击败了24.89%的用户
 */
class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            // 前序遍历 按照中左右的顺序遍历
            TreeNode curNode = stack.pop();
            res.add(curNode.val);
            // 先进后出 右节点先进后出
            if(curNode.right != null){
                stack.push(curNode.right);
            }
            // 后进先出 左节点后进先出
            if(curNode.left != null){
                stack.push(curNode.left);
            }
        }
        return res;
    }
}
