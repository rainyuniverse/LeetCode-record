package Tree.recursion.question437;

import Tree.TreeNode;

public class question437 {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(1, null, null);
        TreeNode node3 = new TreeNode(1, null, null);
        TreeNode node1 = new TreeNode(0, node2, node3);

        Solution solution = new Solution();
        int res = solution.pathSum(node1, 1);
        System.out.print(res);
    }
}
