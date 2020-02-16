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
    List<List<Integer>> result;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        List<Integer> pathSum = new ArrayList<Integer>();
        dfs(root, sum, pathSum);
        return result;
    }

    public void dfs(TreeNode root, int sum, List<Integer> pathSum) {

        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                pathSum.add(new Integer(root.val));
                result.add(new ArrayList<Integer>(pathSum));
                pathSum.remove(pathSum.size() - 1);
            }
            return;
        }

        pathSum.add(new Integer(root.val));
        dfs(root.left, sum - root.val, pathSum);
        dfs(root.right, sum - root.val, pathSum);
        pathSum.remove(pathSum.size() - 1);
    }

}