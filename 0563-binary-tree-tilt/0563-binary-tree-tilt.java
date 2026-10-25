class Solution {
    int totalTilt = 0;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        calculateSum(root);
        return totalTilt;
    }

    private int calculateSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = calculateSum(root.left);
        int rightSum = calculateSum(root.right);

        totalTilt += Math.abs(leftSum - rightSum);

        return root.val + leftSum + rightSum;
    }
}