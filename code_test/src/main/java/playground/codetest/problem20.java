package playground.codetest;

import java.util.Objects;

public class problem20 {


    /*
     *  연산자 순위의 경우의수를 정한뒤 연산 진행
     *  이차원 배열에 가짓수를 모두 넣고 순서대로 계산
     *  숫자 계산할떄는 연산자 발견시 좌우로 숫자가 끝날때까지 계산후 replace 를 통해 결괴로 치환
     */

    public static void main(String[] args) {

    }

    public long solution(String expression) {

        char[][] operator = {
         {'-', '+', '*'},
         {'-', '*', '+'},
         {'+', '-', '*'},
         {'+', '*', '-'},
         {'*', '+', '-'},
         {'*', '-', '+'}
        };

        for (int i = 0; i < 6; i++) {

            String dummy = expression;

            for (int j = 0; j < 3; j++) {
                 char ops = operator[i][j];
                 int lastStartLocation = 0;

                for (int k = 0; k < dummy.length(); k++) {

                }
            }

           long max  = Long.parseLong(dummy);


        }

        long answer = 0;
        return answer;
    }

    public static int calculate(String front, String end, String opString){

        if (Objects.equals(opString, "-")) return Integer.parseInt(front) - Integer.parseInt(end);
        else if (Objects.equals(opString, "+")) return Integer.parseInt(front) + Integer.parseInt(end);
        else if (Objects.equals(opString, "*")) return Integer.parseInt(front) * Integer.parseInt(end);

        return 0;
    }


}
