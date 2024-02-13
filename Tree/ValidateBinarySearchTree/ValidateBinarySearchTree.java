package Tree.ValidateBinarySearchTree;

public class ValidateBinarySearchTree {
    TreeNode upper;
    TreeNode lower;
    public boolean isValidBST(TreeNode root) {

        if (root == null) return true;
        if (upper != null && root.val >= upper.val) return false;
        if (lower != null && root.val <= lower.val) return false;
        TreeNode tmp = upper;
        upper = root;
        if (!isValidBST(root.left)) return false;
        upper = tmp;
        lower = root;
        return isValidBST(root.right);
    }
}
/*
98
TC O(n)
SC O(n)
*/