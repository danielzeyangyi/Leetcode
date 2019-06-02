public class _98_Validate_BST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null ) {
            return true;
        }
        return isValidBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public static boolean isValidBST(TreeNode node, int max, int min) {
        if (node == null ) return true;
        else if (node.val > max || node.val < min) return false;

        return isValidBST(node.left, node.val, min) &&
                isValidBST(node.right, max, node.val);
    }
}
