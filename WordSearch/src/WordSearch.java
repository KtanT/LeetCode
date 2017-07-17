/**
 * 
 */

/**
 * @author Kyran
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0)
            return false;
        if (word.length() == 0)
            return true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((word.charAt(0) == board[i][j]) && find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean find(char[][] board, int i, int j, String word, int index) {
        if (index == word.length())
            return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        board[i][j] = '#';  // Should mark the found/ used char.
        boolean rst = find(board, i - 1, j, word, index + 1) || find(board, i, j - 1, word, index + 1)
                || find(board, i + 1, j, word, index + 1) || find(board, i, j + 1, word, index + 1);
        board[i][j] = word.charAt(index);
        return rst;
    }
}
