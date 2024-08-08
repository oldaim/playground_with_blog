package playground.codetest;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode26 {

    /*
    *  크기 순으로 정렬되어있지만 증가 하는 형태는 아닌 배열 nums
    *  이중에서 중복을 제거 하고 난 배열의 원소수 (고유한 수) k 를 반환 해야한다.
    * */

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);

        System.out.println(k);
    }

     public static int removeDuplicates(int[] nums) {

        int end = 0;
        int count = 1;
        int current = nums[end];
        int[] copyNums = Arrays.copyOf(nums, nums.length);

        while (end < nums.length - 1){

            if (copyNums[end + 1] != current){
                nums[count] = copyNums[end + 1];
                count++;
                current = copyNums[end + 1];
            }
            end++;

        }

        return count;

    }


}
