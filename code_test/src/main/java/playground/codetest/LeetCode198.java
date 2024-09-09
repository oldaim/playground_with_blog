package playground.codetest;

public class LeetCode198 {

    public static void main(String[] args) {

        LeetCode198 leetCode198 = new LeetCode198();

        int[] nums = {2,1,1,2};

        System.out.println(leetCode198.rob(nums));

    }

    public int rob(int[] nums) {

        int length = nums.length;

        if (length == 1){
            return nums[0];
        }else {

            int[] dp = new int[length];

            dp[0] = nums[0];
            dp[1] = nums[1];
            int max = 0;

            for (int i = 2; i < nums.length; i++) {

                /*
                *
                * */

                max = Math.max(max, dp[i - 2]);

                dp[i] = nums[i] + max;



            }

            return Math.max(dp[length - 1], dp[length - 2]);
        }

    }

}
