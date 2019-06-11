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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();
        inorder(root, sol);
        return sol;
    }
    
    public void inorder(TreeNode n, List<Integer> sol){
        if(n == null) return;
        inorder(n.left, sol);
        sol.add(n.val);
        inorder(n.right, sol);
    }
}