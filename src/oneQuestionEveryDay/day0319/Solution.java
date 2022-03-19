package oneQuestionEveryDay.day0319;
//二叉树也太难搞了吧 只是前序遍历还好 加上括号是真的递归不清楚 简单题就做了一个多小时 全倒在括号上了
/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了74.52%的用户
 * 内存消耗：41 MB, 在所有 Java 提交中击败了33.95%的用户
 */
class Solution {
    public String tree2str(TreeNode root) {
        StringBuffer res = new StringBuffer();
        backtracking(root, res);
        res.append(")");
        String result = new String(res);
        result = result.replace("())",")");
        result = result.substring(1, result.length() - 1);
        return result;
    }

    public void backtracking(TreeNode curNode, StringBuffer res){
        res.append("(");
        res.append(curNode.val);
        if(curNode.left == null){
            res.append("()");
        }else{
            backtracking(curNode.left, res);
            res.append(")");
        }
        if(curNode.right == null){
            return;
        }else{
            backtracking(curNode.right, res);
            res.append(")");
        }
    }
}
