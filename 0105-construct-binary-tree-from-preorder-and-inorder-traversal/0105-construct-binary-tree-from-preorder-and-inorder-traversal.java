class Solution {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder,
                          int inStart, int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex]);
        preIndex++;

        int rootIndex = inStart;

        while (inorder[rootIndex] != root.val) {
            rootIndex++;
        }

        root.left = build(preorder, inorder, inStart, rootIndex - 1);

        root.right = build(preorder, inorder, rootIndex + 1, inEnd);

        return root;
    }
}