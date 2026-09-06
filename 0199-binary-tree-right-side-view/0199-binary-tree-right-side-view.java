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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer>result = new ArrayList<>();
        if(root == null){
            return result;

        }
        Queue<TreeNode>queue = new LinkedList<>();
        //qu me root dal
        queue.offer(root);
        //agr qu empty h to uska size checjk kr
        while(!queue.isEmpty()){
            int size = queue.size();
            //current level ke nodes lo
            for(int i = 0;i<size;i++){
                //tre se nikal
                TreeNode node = queue.poll();;
                //curent level k last noide
                if(i == size-1){
                    result.add(node.val);

                }
                if (node.left != null) {
                    queue.offer(node.left);
                }

                // Right child queue mein
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }
}