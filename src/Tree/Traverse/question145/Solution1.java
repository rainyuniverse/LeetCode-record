package Tree.Traverse.question145;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
// 非递归 将 后序遍历的顺序：左右中 进行翻转 中右左（类似前序遍历）
// 但是翻转比较费时
/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了18.09%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了50.69%的用户
 */
class Solution1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curNode = stack.pop();
            res.add(curNode.val);
            // 先进左节点 后出左节点
            if(curNode.left != null){
                stack.push(curNode.left);
            }
            // 后进右节点 先出右节点
            if(curNode.right != null){
                stack.push(curNode.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
