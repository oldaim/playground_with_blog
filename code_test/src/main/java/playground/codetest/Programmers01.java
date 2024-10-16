package playground.codetest;

import java.util.Arrays;

public class Programmers01 {

    public static void main(String[] args) {

        /*
        *  요격 시스템
        *  구간이 주어지면 구간이 모두 포함 될수 있는 x 의 최솟값
        *  s, e 의 범위가 1억이라 한번의 순환으로 끝내야함
        * */
        Programmers01 programmers01 = new Programmers01();

        int [][] targets = {{4,5},{4,8},{10,14},{11,13},{5, 12},{3,7},{1,4}};

        System.out.println(programmers01.solution(targets));
    }

    public int solution(int[][] targets) {
        int answer = 0;

        int [] answers = new int[100_000_000];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < 2; j++) {

                int start = targets[i][0];
                int end = targets[i][1];



            }
        }


        System.out.println(Arrays.deepToString(targets));

        return answer;
    }



}
