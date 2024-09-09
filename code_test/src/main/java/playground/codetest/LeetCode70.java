package playground.codetest;

public class LeetCode70 {

    public static void main(String[] args) {

        LeetCode70 leetCode70 = new LeetCode70();

        System.out.println(leetCode70.climbStairs(4));

    }

    public int climbStairs(int n) {
        // 부분의 합으로 전체 합을 구한다
        /*
            2
            11 [2]

            21
            111
            12 [3]

            1111
            112
            121
            211
            22  [5]

            11111
            1121
            1211
            2111
            221
            212
            1112
            122  [8]
         */

        

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

}
