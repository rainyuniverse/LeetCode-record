package Tree.recursion.question104;

import Tree.TreeNode;

public class question104 {
    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(15, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node3 = new TreeNode(3, node9, node20);

        Solution solution = new Solution();
        System.out.print(solution.maxDepth(node3));
    }
}
