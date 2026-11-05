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
    int goodNodes=0;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return goodNodes;
        }

        dfs(root,root.val);

        return goodNodes;
    }

    public void dfs(TreeNode node, int maxVal){
        if(node == null){
            return;
        }

        if(node.val>=maxVal){
            goodNodes++;
        }

        dfs(node.left,Math.max(node.val,maxVal));
        dfs(node.right,Math.max(node.val,maxVal));

    }
}
