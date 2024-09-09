package playground.codetest;

import java.util.Arrays;
import java.util.Objects;

public class LeetCode97 {

    public static void main(String[] args) {

    }

    public int solve(String s1, String s2, String s3, int i, int j, int k, int[][] dp) {
        // Check if the result for the current (i, j) pair is already computed
        if (dp[i][j] != -1)
            return dp[i][j];

        // Base case: Check if all strings have been used up, indicating successful interleaving
        if (i == s1.length() && j == s2.length() && k == s3.length())
            return 1;

        // Initialize variables to store recursive results
        int x1 = 0, x2 = 0;

        // If characters in s1 and s3 match, explore next character in s1 and s3
        if (i != s1.length()) {
            if (s1.charAt(i) == s3.charAt(k))
                x1 = solve(s1, s2, s3, i + 1, j, k + 1, dp);
        }

        // If characters in s2 and s3 match, explore next character in s2 and s3
        if (j != s2.length()) {
            if (s2.charAt(j) == s3.charAt(k))
                x2 = solve(s1, s2, s3, i, j + 1, k + 1, dp);
        }

        // Store the result in dp[i][j] using logical OR of x1 and x2
        return dp[i][j] = x1 | x2;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length(), n2 = s2.length();

        // Check if the combined length of s1 and s2 is greater than s3
        if (n1 + n2 > s3.length())
            return false;

        // Create a 2D DP array to store intermediate results
        int[][] dp = new int[n1 + 1][n2 + 1];

        // Initialize the DP array with -1
        for (int[] x : dp)
            Arrays.fill(x, -1);

        // Call the solve method to check if interleaving is possible
        // Start with indices (0, 0, 0)
        // If result is 0, return false; if result is 1, return true
        return solve(s1, s2, s3, 0, 0, 0, dp) != 0;
    }

}
