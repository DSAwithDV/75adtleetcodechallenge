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
    int prev =-1;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
        
    }
    public void inorder(TreeNode node){
        if(node==null){
            return;}
    
        inorder(node.left);
        if(prev!=-1){
            int diff = node.val-prev;

        
        if(diff < minDiff){
            minDiff = diff;
        }
        }
        prev = node.val;
        inorder(node.right);
    }
}