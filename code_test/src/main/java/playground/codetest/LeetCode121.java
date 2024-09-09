package playground.codetest;

import java.util.Arrays;

public class LeetCode121 {

    public static void main(String[] args) {

        LeetCode121 leetCode121 = new LeetCode121();

        int [] prices = {7,1,5,3,6,4};

        System.out.println(leetCode121.maxProfit(prices));

    }

    public int maxProfit(int[] prices) {

        /* 정수 배열이 주어졌을때 이익의 최댓값을 구해라
         *  살수도 있고 안살수도 있고, 팔수도 있고 안팔수도 있고
         *
         *   이전의 제일 최솟값과 지금 인덱스를 뺀 값이 DP 테이블에 채워지면 되지 않나
         *
         *   0
         */

        int min = prices[0];
        int maxValue = 0;
        int[] dp = new int[prices.length];
        dp[0] = maxValue;

        for (int i = 1; i < prices.length; i++) {
            //
            dp[i] = prices[i] - min;

            min = Math.min(prices[i], min);
        }

        maxValue = Arrays.stream(dp).max().getAsInt();

        return maxValue;
    }
}
