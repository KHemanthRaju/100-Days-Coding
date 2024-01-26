class Solution {
    private static final int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
        int result = 0;

        for (int moves = 1; moves <= maxMove; moves++) {
            int[][][] temp = new int[m][n][maxMove + 1];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < 4; k++) {
                        int newRow = i + dirs[k][0];
                        int newCol = j + dirs[k][1];

                        if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                            temp[i][j][moves] = (temp[i][j][moves] + 1) % MOD;
                        } else {
                            temp[newRow][newCol][moves] = (temp[newRow][newCol][moves] + dp[i][j][moves - 1]) % MOD;
                        }
                    }
                }
            }

            dp = temp;
        }

        for (int moves = 1; moves <= maxMove; moves++) {
            result = (result + dp[startRow][startColumn][moves]) % MOD;
        }

        return result;
    }

    private static final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
}
