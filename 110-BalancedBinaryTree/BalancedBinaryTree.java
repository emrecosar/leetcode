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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return dfs(root, 0) != -1;
    }

    public int dfs(TreeNode root, int level) {

        if (root == null)
            return 0;

        int left = dfs(root.left, 0);
        int right = dfs(root.right, 0);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + level + 1;
    }

}