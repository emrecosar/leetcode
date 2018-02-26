public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;
        return Math.max(maxDepth(root.getChildAt(0) /* root.left */) + 1, maxDepth(root.getChildAt(1) /* root.right */) + 1);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


}
