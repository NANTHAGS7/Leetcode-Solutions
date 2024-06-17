/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        int cases[] = traverse(root);
        return Math.max(cases[0], cases[1]);
    }

    public int[] traverse(TreeNode root){
        //base case
        if(root == null) return new int[2];

        int[] leftTree = traverse(root.left);
        int[] rightTree = traverse(root.right);
        int[] cases = new int[2];
        
        cases[0] = root.val + leftTree[1] + rightTree[1];
        cases[1] = Math.max(leftTree[0],leftTree[1]) + Math.max(rightTree[0],rightTree[1]);

        return cases;
    }
}