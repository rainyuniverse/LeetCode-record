package search.backtracking.question257;

import java.util.ArrayList;
import java.util.List;

//回溯法
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        String curStr = String.valueOf(root.val);
        backtracking(root, curStr, res);
        return res;
    }

    private void backtracking(TreeNode curNode, String curStr, List<String> res){
        if(curNode.left == null && curNode.right == null){
            res.add(curStr);
            return;
        }
        if(curNode.left != null){
            TreeNode oriNode = curNode;
            curNode = curNode.left;
            curStr = curStr + "->" + curNode.val;
            backtracking(curNode, curStr, res);
            curNode = oriNode;
            curStr = curStr.substring(0, curStr.length() - String.valueOf(curNode.left.val).length() - 2);
        }
        if(curNode.right != null){
            TreeNode oriNode = curNode;
            curNode = curNode.right;
            curStr = curStr + "->" + curNode.val;
            backtracking(curNode, curStr, res);
            curNode = oriNode;
            curStr = curStr.substring(0, curStr.length() - String.valueOf(curNode.right.val).length() - 2);
        }
    }
}
