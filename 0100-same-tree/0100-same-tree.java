class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Dono nodes null hain
        if (p == null && q == null) {
            return true;
        }

        // Sirf ek null hai
        if (p == null || q == null) {
            return false;
        }

        // Values different hain
        if (p.val != q.val) {
            return false;
        }

        // Left aur left compare
        // Right aur right compare
        return isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}