package playground.codetest;

import java.util.*;
import java.util.stream.Collectors;

public class leetcode15 {

    public static void main(String[] args) {

        leetcode15 leetcode15 = new leetcode15();

        int[] nums = {-1,0,1,2,-1,-4};

        leetcode15.threeSum(nums);

    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);


        System.out.println(Arrays.toString(nums));
    }


}
