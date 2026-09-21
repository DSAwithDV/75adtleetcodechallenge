class Solution {

    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] inorder, int[] postorder,
                          int inStart, int inEnd) {

        // koi element nahi bacha
        if (inStart > inEnd) {
            return null;
        }

        // postorder se root
        TreeNode root = new TreeNode(postorder[postIndex]);
        postIndex--;

        // inorder me root dhundo
        int rootIndex = inStart;

        while (inorder[rootIndex] != root.val) {
            rootIndex++;
        }

        // RIGHT subtree pehle
        root.right = build(inorder, postorder,
                           rootIndex + 1, inEnd);

        // LEFT subtree baad me
        root.left = build(inorder, postorder,
                          inStart, rootIndex - 1);

        return root;
    }
}