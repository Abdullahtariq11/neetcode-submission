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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Stack<TreeNode> stack= new Stack<>();
        Stack<Integer> depths = new Stack<>();
        TreeNode current;
        stack.push(root);
        depths.push(1);
        int maxDepth=0;
        while(!stack.isEmpty()){
            current=stack.pop();
            int currentDepth = depths.pop();
            maxDepth = Math.max(maxDepth, currentDepth);
            if(current.right!=null){
                stack.push(current.right);
                depths.push(currentDepth+1);
            }
            if(current.left!=null){
                stack.push(current.left);
                depths.push(currentDepth+1);
            }
        }
        return maxDepth;
    }
}
