package Tree.BinaryTreeLevelOrderTraversal;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return res;
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode popped = q.remove();
                lst.add(popped.val);
                if (popped.left != null) q.add(popped.left);
                if (popped.right != null) q.add(popped.right);
            }
            res.add(lst);
        }

        return res;
    }
}
/*
102
TC On
SC On
*/
