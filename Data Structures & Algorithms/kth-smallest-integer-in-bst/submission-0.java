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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        List<TreeNode> nodes;
        nodes= dfsInOrder(root,new ArrayList<>());

        return nodes.get(k-1).val;

    }

    public List<TreeNode> dfsInOrder(TreeNode root,List<TreeNode> nodes) {
        if (root == null) {
            return nodes;
        }
        dfsInOrder(root.left,nodes);
        nodes.add(root);
        dfsInOrder(root.right,nodes);
        return nodes;

    }
}
