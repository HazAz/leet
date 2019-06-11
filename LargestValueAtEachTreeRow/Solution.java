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
   public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        largestValuesHelper(root, res, 0);
        return res;
    }
    
    public void largestValuesHelper(TreeNode node, List<Integer> res, int level){
        if(node == null) return;
        
        if(res.size() == level) res.add(Integer.MIN_VALUE);
        res.set(level, Math.max(node.val, res.get(level)));
        
        largestValuesHelper(node.left, res, level + 1);
        largestValuesHelper(node.right, res, level + 1);
    }
}