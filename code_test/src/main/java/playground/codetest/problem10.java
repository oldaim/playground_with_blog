package playground.codetest;

import java.util.ArrayList;
import java.util.Arrays;

public class problem10 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {


        // 먼저 0 을 제거 하는 작업이 1 -> 에서 0을 제거한 숫자가 배열에 담긴다.
        // 그다음 길이를 측정하고 2진법으로 변경하는 로직이 2
        int count = 0;
        int loop = 0;

        while (!s.equals("1")) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') count++;
            }


            s = s.replace("0", "");
            loop++;
            s = Integer.toString(s.length(), 2);

        }

        int[] answer = new int[2];

        answer[1] = count;
        answer[0] = loop;

        return answer;
    }

}
