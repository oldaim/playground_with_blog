package playground.codetest;

import java.util.Arrays;

public class problem19 {

    /*
    *  yellow 의 개수가 직사각형이 되기 위해선 두수의 곱으로 이루어져야 한다.
    *  따라서 공약수 끼리의 곱으로 직사각형이 되는 경우 (두수의 합) * 2 + 4 이 필요한 brown 의 최소 갯수
    *
    *
    *
    * */


    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(24, 24)));

    }

    public static int[] solution(int brown, int yellow) {

        int [] answer = new int[2];

        for (int i = 1; i <= yellow; i++) {

            if (yellow % i == 0){

                int width = i;
                int height = yellow / i;

                int minimum = 2 * (width + height) + 4;

                if (minimum == brown){

                    if (width > height) {
                        answer[0] = width + 2;
                        answer[1] = height + 2;
                    }else {
                        answer[0] = height + 2;
                        answer[1] = width + 2;
                    }

                    break;

                }
            }

        }


        return answer;
    }
}
