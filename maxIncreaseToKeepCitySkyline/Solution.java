class Solution {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    int length = grid.length;
    int[] col = new int[length];
    int[] row = new int[length];
    for(int r = 0; r < length; r++){
      for(int c = 0; c < length; c++){
        row[r]=  Math.max(row[r], grid[r][c]);
        col[c] = Math.max(col[c], grid[r][c]);
      }
    }
    
    int sol = 0;
    for(int r = 0; r < length; r++){
      for(int c = 0; c < length; c++){
        sol += Math.min(row[r],  col[c]) - grid[r][c]; 
      }
    }
    return sol;
  }
}