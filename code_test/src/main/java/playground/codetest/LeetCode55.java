package playground.codetest;

public class LeetCode55 {

    /*
    *
    * dp[0] 저장
    * 만약 dp[0] 에 저장된 인덱스 보다 작은데 자기 인덱스 + 배열값이 dp[0] 보다 큰 경우 그 값 저장
    * dp[lastIndex] 값이 lastIndex - 1 보다 작으면 false 크면 true
    * */

    public static void main(String[] args) {

        LeetCode55 leetCode55 = new LeetCode55();

        int[] nums = {0,2,3};

        System.out.println(leetCode55.canJump(nums));

    }

    public boolean canJump(int[] nums) {

        int[] dp = new int[nums.length];

        dp[0] = nums[0];

        if (nums.length == 1) return true;
        else {

            for (int i = 1; i < nums.length - 1; i++) {

                if (dp[i - 1] >= i) dp[i] = Math.max(dp[i - 1], nums[i] + i);
                else dp[i] = dp[i - 1];

            }

            return dp[nums.length - 2] >= nums.length;
        }
    }
}
