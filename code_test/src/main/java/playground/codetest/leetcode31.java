package playground.codetest;

import java.util.Arrays;

public class leetcode31 {

    public static void main(String[] args) {

        leetcode31 leetcode31 = new leetcode31();
        int[] arr = {5,1,1};

        leetcode31.nextPermutation(arr);
    }

     public void nextPermutation(int[] nums) {

         int moveIndex = nums.length - 1;

         while (moveIndex >= 0 && nums.length > 1){

             if (isDescending(moveIndex, nums) && moveIndex > 0) moveIndex--;
             else {
                 findMinimum(moveIndex + 1, nums);
                 break;
             }

         }

         System.out.println(Arrays.toString(nums));

     }



    private void findMinimum(int m, int[] nums) {

         int min = Integer.MAX_VALUE;
         int minIndex = -1;
         int box;
         int baseValue = nums[m - 1];

         for (int i = m; i < nums.length; i++){
             if (nums[i] > baseValue && nums[i] - baseValue <= min){
                 min = nums[i] - baseValue;
                 minIndex = i;
             }
         }

         if (minIndex == -1){
             for (int i = m; i < nums.length; i++){
                 if (min >= nums[i]){
                     min = nums[i];
                     minIndex = i;
                 }
            }
         }

         box = nums[m - 1];
         nums[m - 1] = nums[minIndex];
         nums[minIndex] = box;

         Arrays.sort(nums, m, nums.length);

    }

    private boolean isDescending(int moveIndex, int[] nums) {

         for (int i = moveIndex; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) return false;
        }

        return true;

     }


}
