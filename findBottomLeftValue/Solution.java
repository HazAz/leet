/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list, 0);
        return list.get(list.size() - 1);
    }
    public static void helper(TreeNode node, List<Integer> list, int level){
        if(node == null) return;
        if(level == list.size()) list.add(node.val);
        helper(node.left, list, level + 1);
        helper(node.right, list, level+1);
    }
}