class Solution {
    public int countBattleships(char[][] board) {
        int sol = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X'){
                    sol++;
                    if(i < board.length-1 && board[i+1][j] == 'X') removeUp(board, i, j);
                    if(j < board[0].length -1 && board[i][j+1] == 'X') removeRight(board, i, j);
                }
            }
        }
        return sol;
    }
    
    public static void removeUp(char[][] board, int a, int b){
        for(int i = a; i < board.length; i++){
            if (board[i][b] == '.') break;
            board[i][b] = '.';
        }
    }
    
    public static void removeRight(char[][] board, int a, int b){
        for(int j = b; j < board[0].length; j++){
            if (board[a][j] == '.') break;
            board[a][j] = '.';
        }
    }
}