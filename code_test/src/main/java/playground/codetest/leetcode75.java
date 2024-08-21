package playground.codetest;

import java.util.Arrays;

public class leetcode75 {
    /**
     * 주어진 nums 배열에 빨간색, 흰색, 파란색으로 색칠된 n개의 객체
     * 정렬 함수 없이 정렬?
     * 걍 0, 1, 2 갯수만큼 세고 채워넣으면 되는거 아닌가?
     */

    public static void main(String[] args) {

        leetcode75 leetcode75 = new leetcode75();

        int[] nums = {2,0,2,1,1,0};

        leetcode75.sortColors(nums);
    }

    public void sortColors(int[] nums) {

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        int[] copyNums = new int[nums.length];

        for (int num : nums) {
            switch (num) {
                case 0 -> zeroCount++;
                case 1 -> oneCount++;
                default -> twoCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (zeroCount != 0){
                nums[i] = 0;
                zeroCount--;
            }else if (oneCount != 0){
                nums[i] = 1;
                oneCount--;
            }else {
                nums[i] = 2;
                twoCount--;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
