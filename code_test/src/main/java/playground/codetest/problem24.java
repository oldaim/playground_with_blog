package playground.codetest;

import java.util.Arrays;
import java.util.HashSet;

public class problem24 {


    public static void main(String[] args) {

        int[] ans = {2,1,3,4,1};

        System.out.println(Arrays.toString(solution(ans)));
    }

    public static int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (i != j) set.add(numbers[i] + numbers[j]);
            }

        }

        int[] answer = Arrays.stream(set.stream().mapToInt(Integer::intValue).toArray()).sorted().toArray();

        return answer;
    }
}
