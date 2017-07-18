/**
 * 
 */

/**
 * @author Kyran
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int numOfLive = getState(board, m, n, i, j);
                /**
                 * 0: Dead; 1 :Live
                 */
                if (board[i][j] == 0 && numOfLive == 3) {
                    board[i][j] = 2;
                }
                if (board[i][j] == 1 && numOfLive <= 3 && numOfLive >= 2) {
                    board[i][j] = 3;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] >> 1;
            }
        }
    }

    private int getState(int[][] board, int m, int n, int i, int j) {
        int live = 0;
        
        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                live = live + (board[x][y] & 1);
            }
        }
        
        live = live - (board[i][j] & 1);
        
        return live;
    }
}
