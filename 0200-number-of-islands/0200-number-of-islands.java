class Solution {

    void solve(int x, int y, int n, int m, char[][] grid, boolean[][] visited) {
        visited[x][y] = true;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m
                    && grid[nx][ny] == '1'
                    && !visited[nx][ny]) {

                solve(nx, ny, n, m, grid, visited);
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    solve(i, j, n, m, grid, visited);
                    count++;
                }

            }
        }

        return count;
    }
}