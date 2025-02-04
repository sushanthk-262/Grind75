/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        //base cases
        if(root == null) return root;

        //main recursive logic
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        TreeNode temp = new TreeNode();

        temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}