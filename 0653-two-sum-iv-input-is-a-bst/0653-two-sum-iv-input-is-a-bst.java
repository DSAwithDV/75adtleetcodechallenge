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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>set = new HashSet<>();
        return check(root,k,set);
        
    }
    public boolean check(TreeNode node,int k,HashSet<Integer>set){
        if(node == null){
            return false;
        }
        int needed = k - node.val;

        if(set.contains(needed)){
            return true;

        }
        set.add(node.val);

        return check(node.left,k,set) || check(node.right,k,set);
    }
}