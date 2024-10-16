package playground.codetest;

public class LeetCode157 {

    /*

     */

    public static void main(String[] args) {
        LeetCode157 leetCode157 = new LeetCode157();

        int[] nums = {2,-5,-2,-4,3};

        int answer = leetCode157.maxProduct(nums);

        System.out.println(answer);
    }

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 초기값 설정
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        // 배열을 두 번째 원소부터 순회
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // 현재 값이 음수일 경우 maxProduct와 minProduct를 swap
            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // 현재 값, 현재 값과 곱한 최대값, 현재 값과 곱한 최소값 중에서 선택
            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            // 결과값 갱신
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
