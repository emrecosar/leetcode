public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int x = grid.length;
        if (x == 0)
            return 0;
        int y = grid[0].length;
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1') {
                    DFS(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void DFS(char[][] grid, int x, int y) {

        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        DFS(grid, x + 1, y);
        DFS(grid, x - 1, y);
        DFS(grid, x, y + 1);
        DFS(grid, x, y - 1);
    }

}