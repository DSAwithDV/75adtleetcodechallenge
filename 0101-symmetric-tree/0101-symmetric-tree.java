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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return checkMirror(root.left,root.right);
        
    }
    public boolean checkMirror(TreeNode left,TreeNode right){
        // agr dono null h to true 
        if(left == null && right == null){
            return true;
        }
        //sirf ek null h 
        if(left == null || right == null){
            return false;
        }
        //value different h to aflse return krnabh
        if(left.val!= right.val){
            return false;
        }
        return checkMirror(left.left , right.right) && checkMirror(left.right,right.left);
    }
}