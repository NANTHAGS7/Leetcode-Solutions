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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        dfs(postorder,root);
        return postorder;
    }

    public void dfs(List<Integer> post,TreeNode root){
        if(root!=null){
            if(root.left!=null){
                dfs(post,root.left);
            }
            if(root.right!=null){
                dfs(post,root.right);
            }
            post.add(root.val);
        }
    }
}