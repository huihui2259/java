package myjava;

public class Exist {

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] used = new boolean[m][n];
        boolean res = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res = find(board, i, j, 1, used, word);
                if (res) {
                    return res;
                }
            }
        }
        return res;
    }

    public boolean find(char[][] board, int i, int j, int len, boolean[][] used, String word) {
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(len - 1)) {
            return false;
        }
        if (used[i][j] == true) {
            return false;
        }
        if (len == word.length()) {
            return true;
        }

        used[i][j] = true;
        boolean res = find(board, i + 1, j, len + 1, used, word) || find(board, i - 1, j, len + 1, used, word)
                || find(board, i, j - 1, len + 1, used, word) || find(board, i, j + 1, len + 1, used, word);
        used[i][j] = false;
        return res;
    }
}
