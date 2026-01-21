public class Ten {

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (check(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean check(char[][] board, int i, int j, int index, String word) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }

        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        if (index == word.length() - 1) {
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found =
                check(board, i - 1, j, index + 1, word) ||
                        check(board, i + 1, j, index + 1, word) ||
                        check(board, i, j - 1, index + 1, word) ||
                        check(board, i, j + 1, index + 1, word);

        board[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        Ten t = new Ten();
        System.out.println(t.exist(board, word));
    }
}
