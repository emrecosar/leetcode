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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode c = queue.poll();
                if (c.left != null) queue.offer(c.left);
                if (c.right != null) queue.offer(c.right);
                row.add(c.val);
            }
            result.add(row);
        }
        Collections.reverse(result);
        return result;

    }
}