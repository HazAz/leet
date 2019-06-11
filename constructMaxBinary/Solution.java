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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length);
    }
    
    public static TreeNode helper(int[] nums, int left, int right){
        if(left == right) return null;
        int maxIndex = left;
        for(int i = left; i < right; i++){
            if(nums[i] > nums[maxIndex]) maxIndex = i;
        }
        
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = helper(nums, left, maxIndex);
        root.right=helper(nums, maxIndex+1, right);
        return root;
    }
}