package playground.codetest;

public class LeetCode64 {

    public static void main(String[] args) {

        LeetCode64 leetCode64 = new LeetCode64();

        int[][] grid = {{1,2},{1,1}};

        System.out.println(leetCode64.minPathSum(grid));

    }

    public int minPathSum(int[][] grid) {

        int[][] dx = {{1,0},{-1,0},{0,-1},{0,1}};

        int height = grid.length;
        int width = grid[0].length;

        boolean[][] visited = new boolean[height][width];
        int[][] dp = new int[height][width];

        dp[0][0] = grid[0][0];
        visited[0][0] = true;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                for (int[] its : dx) {

                    int x = its[0];
                    int y = its[1];

                    int testX = j + x;
                    int testY = i + y;

                    if (testX >= 0 && testY >= 0 && testX < width && testY < height) {
                        if (visited[testY][testX]) {
                            ans = Math.min(ans, grid[i][j] + dp[testY][testX]);
                            dp[i][j] = ans;
                        }
                    }

                }

                ans = Integer.MAX_VALUE;
                visited[i][j] = true;

            }
        }

        return dp[height - 1][width - 1];
    }
}
