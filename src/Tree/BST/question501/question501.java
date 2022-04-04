package Tree.BST.question501;


import Tree.TreeNode;

public class question501 {
    public static void main(String[] args) {
        TreeNode node01 = new TreeNode(0, null, null);
        TreeNode node02 = new TreeNode(0, null, null);
        TreeNode node03 = new TreeNode(0, node01, null);
        TreeNode node04 = new TreeNode(0, node03, node02);

        TreeNode node11 = new TreeNode(1, null, null);
        TreeNode node12 = new TreeNode(1, null, null);
        TreeNode node13 = new TreeNode(1, node11, node12);
        TreeNode node14 = new TreeNode(1, node04, node13);

        Solution1 solution1 = new Solution1();
        int[] res = solution1.findMode(node14);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
