package Tree.ConvertSortedArrayToBinarySearchTree;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)return null;
        return treeConstructor(nums, 0, nums.length-1);
    }

    public TreeNode treeConstructor(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = treeConstructor(nums,  left,      mid - 1);
        node.right = treeConstructor(nums, mid + 1 , right);
        return node;
    }
}

/*
108
TC O(n)
SC O(n)
 */
