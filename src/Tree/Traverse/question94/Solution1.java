package Tree.Traverse.question94;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.7 MB, 在所有 Java 提交中击败了14.11%的用户
 */
public class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        TreeNode curNode = root;
        while(!stack.isEmpty() || curNode != null){
            // 如果当前节点不为空 则一直往左下角走 并把当前节点加入栈
            // 如果当前节点为空 栈顶端元素出栈作为当前节点 并进入当前节点的右子树
            if(curNode != null){
                stack.push(curNode);
                curNode = curNode.left;
            }else{
                curNode = stack.pop();
                // 现在的curNode相当于一个中节点
                res.add(curNode.val);
                // 遍历右节点
                curNode = curNode.right;
                // 如果右节点遍历完毕 最后一个为Null 执行元素出栈操作 当前节点向上移
            }
        }
        return res;
    }
}
