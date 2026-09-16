class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        // 1. Node nahi mila
        if (root == null) {
            return null;
        }

        // 2. Key chhoti hai → left jao
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        // 3. Key badi hai → right jao
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // 4. Key mil gayi
        else {

            // 5. Left child nahi hai
            if (root.left == null) {
                return root.right;
            }

            // 6. Right child nahi hai
            if (root.right == null) {
                return root.left;
            }

            // 7. Dono children hain
            TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            // 8. Current node ki value replace
            root.val = successor.val;

            // 9. Duplicate successor ko delete
            root.right = deleteNode(root.right, successor.val);
        }

        // 10. Updated tree return
        return root;
    }
}