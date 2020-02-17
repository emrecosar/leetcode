class Solution {
    public void gameOfLife(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        // Create a copy of the original board
        int[][] copyBoard = new int[rows][cols];

        // Create a copy of the original board
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                copyBoard[row][col] = board[row][col];
            }
        }

        for (int i = 0; i < copyBoard.length; i++) {
            for (int j = 0; j < copyBoard[0].length; j++) {
                int v = copyBoard[i][j];
                int n = nb(copyBoard, i, j);
                if (v == 0) {
                    if (n == 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                } else {
                    if (n < 2)
                        board[i][j] = 0;
                    else if (n >= 2 && n <= 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                }
            }
        }
    }

    public int nb(int[][] board, int i, int j) {
        int nc = 0;
        for (int ii = i - 1; ii <= i + 1; ii++) {
            for (int jj = j - 1; jj <= j + 1; jj++) {
                if (ii == i && jj == j)
                    continue;

                if (ii < 0 || ii >= board.length || jj < 0 || jj >= board[0].length)
                    continue;

                if (board[ii][jj] == 1)
                    nc++;
            }
        }
        return nc;
    }
}