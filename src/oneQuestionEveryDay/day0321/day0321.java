package oneQuestionEveryDay.day0321;

public class day0321 {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node2, node4);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, node7);
        TreeNode node5 = new TreeNode(5, node3, node6);

        Solution solution = new Solution();
        System.out.print(solution.findTarget(node5, 28));
    }
}
