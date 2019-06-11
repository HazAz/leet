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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length-1);
        
    }
    
    
    public static TreeNode bst(int[] nums, int start, int end){
        if(end < start) return null;
        int mid = (start+end)/2;
        TreeNode r = new TreeNode(nums[mid]);
        r.left = bst(nums, start, mid-1);
        r.right = bst(nums, mid+1, end);
        return r;
    }
}