package Tree.BST.question230;

import Tree.TreeNode;
// 等价于二叉树的中序遍历 但递归法需要遍历整棵树
// 递归
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.3 MB, 在所有 Java 提交中击败了32.75%的用户
 */
class Solution {
    // 记录当前节点是第flag小的数
    int flag = -1;
    // 记录是否寻找到了树的左下角
    int onecount = 0;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }

    public void dfs(TreeNode curNode, int k){
        // 第一次进入树的最左下位置 即找到二叉搜索树中的最小数 然后从flag = 0开始计数(当前是空节点所以从0开始)
        if(curNode == null && onecount == 0){
            flag = 0;
            onecount = 1;
            return;
        }
        // 除第一次进入空节点之外进入空节点的情况 直接返回
        if(curNode == null){
            return;
        }
        // 先遍历左子树
        dfs(curNode.left, k);
        // 当前节点
        flag++;
        if(flag == k){
            res = curNode.val;
        }
        // 最后遍历右子树
        dfs(curNode.right, k);
        return;
    }
}
