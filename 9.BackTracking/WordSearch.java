public class WordSearch {
    static boolean[][] visited;

    private boolean search(char[][] board, String word, int r, int c, int index) {
        if (index == word.length()) {
            return true;
        }
        if (r >= board.length || r < 0 || c >= board[r].length || c < 0 || board[r][c] != word.charAt(index)
                || visited[r][c]) {
            return false;
        }

        visited[r][c] = true;
        if (search(board, word, r - 1, c, index + 1) ||
                search(board, word, r + 1, c, index + 1) ||
                search(board, word, r, c - 1, index + 1) ||
                search(board, word, r, c + 1, index + 1)) {
            return true;
        }
        visited[r][c] = false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if ((word.charAt(0) == board[r][c]) && search(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

}
