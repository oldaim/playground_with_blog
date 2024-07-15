package playground.codetest;

import java.util.ArrayList;
import java.util.List;

public class ConvertNaturalNumber {

    public static void main(String[] args) {
        int[] answer = solution(123456);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] solution(long n) {

        String s = Long.toString(n);

        StringBuilder sb = new StringBuilder(s);

        sb = sb.reverse();


        char[] ans = sb.toString().toCharArray();
        int[] answer = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            answer[i] = ans[i] - '0';
        }

       return answer;
    }
}
