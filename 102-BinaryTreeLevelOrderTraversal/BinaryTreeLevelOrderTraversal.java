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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null)
            return result;

        List<TreeNode> childs = new ArrayList<TreeNode>();
        childs.add(root);

        while (!childs.isEmpty()) {

            List<Integer> row = new ArrayList<Integer>();
            List<TreeNode> newChilds = new ArrayList<TreeNode>();
            for (int i = 0; i < childs.size(); i++) {
                TreeNode c = childs.get(i);
                row.add(c.val);
                if (c.left != null)
                    newChilds.add(c.left);
                if (c.right != null)
                    newChilds.add(c.right);
            }

            result.add(row);
            childs = newChilds;

        }

        return result;
    }
}