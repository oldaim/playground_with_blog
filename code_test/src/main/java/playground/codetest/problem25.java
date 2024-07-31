package playground.codetest;

import java.util.Arrays;

public class problem25 {

    /*
        논문 n 편 중, h번 이상 인용된 논문이 h편 이상 이고
        나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 h-index
     */

    public static void main(String[] args) {
        int[] ans = {3,0,6,1,5};

        System.out.println(solution(ans));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        int[] sortedArray = Arrays.stream(citations).sorted().toArray();

        System.out.println(Arrays.toString(sortedArray));

        for (int i = sortedArray.length; i >= 1; i--) {

            int index = sortedArray.length - i;

            if (sortedArray[index] >= i) return i;

        }


        return 0;
    }
}
