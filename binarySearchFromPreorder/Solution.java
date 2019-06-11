class Solution {
  public static void main(String args[]){
    int[] y = {8,5,1,7,10,12};
    TreeNode x = bstFromPreorder(y);
  }
  public static TreeNode bstFromPreorder(int[] preorder) {
    TreeNode root = new TreeNode(preorder[0]);
    if (preorder.length == 1) return root;
   
    int index = -1;
    
    //find index of first element greater than root
    for(int i = 0; i < preorder.length; i++){
      if(preorder[i] > preorder[0]){
        index = i;
        break;
      }    
    }
 
    //alone or all smaller
    if(index == -1){
      if(preorder.length > 1){
        int[] left1 = new int[preorder.length - 1];
        for(int i=0; i < preorder.length-1; i++){
          left1[i] = preorder[i+1];
        }
        root.left = bstFromPreorder(left1);
      }
      return root;
    }
 
    
    //everything before index is on left of root
    if(index > 1){
      int[] left = new int[index-1];
      for(int i = 1; i < index; i++){
        left[i-1] = preorder[i];
      }
      root.left = bstFromPreorder(left);
    }
    
    //everything after index is on right of root
    if(index != -1 && index <= preorder.length-1){
      int[] right = new int[preorder.length - index];
      for(int i = index; i < preorder.length; i++){
        right[i - index] = preorder[i];
      }
      System.out.println();
      System.out.println("root right ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      root.right = bstFromPreorder(right);
    }
    return root;
  }
}