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
        if(root == null){
            return root;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current= queue.poll();
            TreeNode temp;

            if(current.left != null && current.right != null){
                temp= current.right;
                current.right=current.left;
                current.left=temp;
                queue.offer(current.left);
                queue.offer(current.right);
            }
            else if (current.left != null) {
                current.right = current.left;
                current.left= null;
                queue.offer(current.right);
            }

            else if (current.right != null) {
                current.left = current.right;
                current.right= null;
                queue.offer(current.left);
            }
        }

        return root;

    }
}
