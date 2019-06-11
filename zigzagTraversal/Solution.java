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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = 0;
        List<List<Integer>> sol = new ArrayList<>();
        preorder(root, sol, 0);
        return sol;
    }
    
    public static void preorder(TreeNode node, List<List<Integer>> sol, int level){
        if(node == null) return;
        if(level == sol.size()){
            sol.add(new ArrayList<Integer>());
        }
        if(level%2 == 0){
            sol.get(level).add(node.val);
        }
        else{
            sol.get(level).add(0, node.val);
        }
        
        preorder(node.left, sol, level+1);
        preorder(node.right, sol, level+1);
        
    }
}