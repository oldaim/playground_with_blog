package playground.codetest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class leetcode15 {

    public static void main(String[] args) {

        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};

        leetcode15 s = new leetcode15();

        System.out.println(s.threeSum(nums));


    }

    // 일단 조건이 합쳐서 0 이 되어야 한다.
    // i, j, k 의 index 가 모두 달라야 한다.
    // 그리고 인덱스에서 나온 조합이 distinct 해야한다.
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> setList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int k = j; k < nums.length; k++){

                   if (isDistinctThreeSum(i, j, k, nums)) {

                       List<Integer> newSet = returnToSet(nums[i], nums[j], nums[k]);

                       if(setList.stream().noneMatch(set -> new HashSet<>(set).containsAll(new HashSet<>(newSet)))){
                           setList.add(newSet);
                       }

                   }

                }
            }
        }

        return setList.stream().map(set -> set.stream().toList()).toList();
    }

    public boolean isDistinctThreeSum(int i , int j, int k, int[] nums){
        return nums[i] + nums[j] + nums[k] == 0 && i != j && j != k && i != k;
    }

    public List<Integer> returnToSet(int i, int j, int k){
        List<Integer> newSet = new ArrayList<>();

        newSet.add(i);
        newSet.add(j);
        newSet.add(k);

        return newSet;
    }

}
