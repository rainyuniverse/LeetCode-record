package Tree.Traverse.question145;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
// 递归
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.7 MB, 在所有 Java 提交中击败了24.69%的用户
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    public void dfs(TreeNode curNode, List<Integer> res){
        if(curNode == null){
            return;
        }
        dfs(curNode.left, res);
        dfs(curNode.right, res);
        res.add(curNode.val);
    }
}
