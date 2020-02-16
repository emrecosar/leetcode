/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int level) {

        if (root == null)
            return 0;

        int left = dfs(root.left, 0);
        int right = dfs(root.right, 0);

        if (left == 0 && right == 0)
            return 1;

        if (left != 0 && right != 0)
            return Math.min(left, right) + level + 1;

        if (left == 0)
            return right + level + 1;

        if (right == 0)
            return left + level + 1;

        return 0;
    }
}