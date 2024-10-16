package playground.codetest;

public class LeetCode322 {

    public static void main(String[] args) {

        LeetCode322 leetCode322 = new LeetCode322();

        int[] coins = {186,419,83,408};

        System.out.println(leetCode322.coinChange(coins, 6249));

    }

    public int coinChange(int[] coins, int amount) {

        /*
        *  결국 최소 합 이니깐 그 시점에서 선택할수 있는 최대값을 고르되
        *  값을 넘기게 되면 -1 일치하면 그대로 반환
        *  while 사용해야 겠네
        * */

        int dpSum = 0;
        int changeCount = 0;

        if (amount == 0) return 0;

        while (dpSum < amount){

            int max = Integer.MIN_VALUE;
            int sub = amount - dpSum;

            for (int coin : coins) {
                if (coin <= sub) max = Math.max(max, coin);
            }

            if (max == Integer.MIN_VALUE) return -1;
            else  dpSum += max;

            changeCount++;

        }

        if (dpSum == amount) return changeCount;
        else return -1;
    }
}
