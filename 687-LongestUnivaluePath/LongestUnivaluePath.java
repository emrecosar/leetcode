/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {

        if(root == null)
            return 0;

        int leftTree = dfs(root.left);
        int rightTree = dfs(root.right);
        int left = 0;
        int right = 0;

        if (root.left != null && root.val == root.left.val)
            left = leftTree + 1;
        if (root.right != null && root.val == root.right.val)
            right = rightTree + 1;

        max = Math.max(max, left + right);
        return Math.max(left, right);
    }

}