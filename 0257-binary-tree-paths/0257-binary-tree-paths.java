class Solution {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        StringBuilder path = new StringBuilder();

        dfs(root, path);

        return result;
    }

    void dfs(TreeNode node, StringBuilder path) {

        if (node == null) {
            return;
        }

        // current node ko path mein add
        int length = path.length();

        if (path.length() > 0) {
            path.append("->");
        }

        path.append(node.val);

        // leaf mil gaya
        if (node.left == null && node.right == null) {
            result.add(path.toString());

            // current node ko remove karke wapas jao
            path.setLength(length);
            return;
        }

        // left aur right traverse
        dfs(node.left, path);
        dfs(node.right, path);

        // backtracking
        path.setLength(length);
    }
}