package Tree.recursion.question671;

import Tree.TreeNode;

public class question671 {
    public static void main(String[] args) {
        TreeNode node21 = new TreeNode(2, null, null);
        TreeNode node51 = new TreeNode(5, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node52 = new TreeNode(5, node51, node7);
        TreeNode node22 = new TreeNode(2, node21, node52);

        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        System.out.print(solution1.findSecondMinimumValue(node22));
    }
}
