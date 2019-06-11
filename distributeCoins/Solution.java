class Solution {
    int sol;
    public int distributeCoins(TreeNode root) {
        sol = 0;
        dist(root);
        return sol;
    }
    
    public int dist(TreeNode n){
        if(n == null) return 0;
        int l = dist(n.left);
        int r = dist(n.right);
        sol += Math.abs(l) + Math.abs(r);
        return n.val + l + r -1;
    }
}