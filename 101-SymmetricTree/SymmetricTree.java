public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root != null ? checkTree(root.left, root.right) : true;
    }

    public boolean checkTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null && right != null) || (left != null && right == null)) return false;
        if (left.val != right.val) return false;

        boolean leftSide = checkTree(left.left, right.right);
        boolean rightSide = checkTree(left.right, right.left);

        return leftSide && rightSide;
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