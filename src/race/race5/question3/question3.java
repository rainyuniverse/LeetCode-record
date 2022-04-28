package race.race5.question3;

import Tree.TreeNode;

public class question3 {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);
        TreeNode node2 = new TreeNode(2, null, node3);
        TreeNode node = new TreeNode(1, null, node2);
        Solution solution = new Solution();
        int[][] ops = new int[][]{{1,2,4},{1,1,3},{0,3,5}};
        System.out.print(solution.getNumber(node, ops));
    }
}
