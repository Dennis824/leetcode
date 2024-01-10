package AmountOfTimeForBinaryTreeToBeInfected2385;

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */


class AmountOfTimeForBinaryTreeToBeInfected2385{

    public void convert(TreeNode current, int parent, Map<Integer, Set<Integer>> map){
        if (current == null) {
            return;
        }
        if (!map.containsKey(current.val)) {
            map.put(current.val, new HashSet<>());
        }
        Set<Integer> adjacentList = map.get(current.val);
        if (parent != 0) {
            adjacentList.add(parent);
        }
        if (current.left != null) {
            adjacentList.add(current.left.val);
        }
        if (current.right != null) {
            adjacentList.add(current.right.val);
        }
        convert(current.left, current.val, map);
        convert(current.right, current.val, map);
    }