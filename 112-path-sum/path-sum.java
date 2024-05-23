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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> levelSum = new Stack<>();

        path.push(root);
        levelSum.push(root.val);

        while(!path.isEmpty()){
            TreeNode temp = path.pop();
            int tSum = levelSum.pop();

            if(temp.right == null && temp.left == null && tSum == sum) return true;

            if(temp.right != null){
                path.push(temp.right);
                levelSum.push(temp.right.val + tSum);
            }

            if(temp.left != null){
                path.push(temp.left);
                levelSum.push(temp.left.val + tSum);
            }
        }
        return false;
    }
}