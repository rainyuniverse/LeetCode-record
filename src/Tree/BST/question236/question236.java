package Tree.BST.question236;

import Tree.TreeNode;

public class question236 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node2 = new TreeNode(2, node7, node4);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node2);
        TreeNode node0 = new TreeNode(0, null, null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node1 = new TreeNode(1, node0, node8);
        TreeNode node3 = new TreeNode(3, node5, node1);

        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        System.out.print(solution1.lowestCommonAncestor(node3, node5, node4).val);
    }
}
