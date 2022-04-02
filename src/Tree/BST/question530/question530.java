package Tree.BST.question530;

import Tree.TreeNode;

public class question530 {
    public static void main(String[] args) {
        TreeNode node227 = new TreeNode(227, null, null);
        TreeNode node911 = new TreeNode(911, null, null);
        TreeNode node104 = new TreeNode(104, null, node227);
        TreeNode node701 = new TreeNode(701, null, node911);
        TreeNode node236 = new TreeNode(236, node104, node701);

        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        System.out.print(solution1.getMinimumDifference(node236));
    }
}
