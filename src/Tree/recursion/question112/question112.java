package Tree.recursion.question112;

import Tree.TreeNode;

public class question112 {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, node2, null);
        Solution solution = new Solution();
        System.out.print(solution.hasPathSum(node1, 1));
    }
}
