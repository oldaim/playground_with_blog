package playground.codetest;

import java.util.Arrays;

public class LeetCode561 {

    public static void main(String[] args) {

        LeetCode561 leetCode561 = new LeetCode561();

        int answer = leetCode561.arrayPairSum(new int[] {6,2,6,5,1,2});

        System.out.println(answer);
    }

    public int arrayPairSum(int[] nums) {
        /*
            정렬을 해서 낮은건 낮은것 끼리 높은건 높은것 끼리
            묶어서 합을 구하면 될거같은데

            그래야 Min 의 역할이 최소화 될거같다
         */

        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i = i + 2) {

            int minValue = Math.min(nums[i], nums[i+1]);

            sum += minValue;
        }

        return sum;
    }
}
