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
    //int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root.val <= R && root.val >= L) sum += root.val;
        if(root.left != null)  sum += rangeSumBST(root.left, L, R);
        if (root.right != null) sum += rangeSumBST(root.right, L, R);
        return sum;
        
    }
}