package playground.codetest;

public class Programmers04 {

    /*
        혼자서 하는 틱택토

        - 선공이 O, 후공이 X
        - 가로 세로 대각선으로 3개를 완성하면 승리 하는 규칙
        - 그러면 나오면 안되는 경우의 수를 하나씩 다 찾아봐야 되는 건가
        - 일단 연습문제에서 나온 경우의 수를 종합 해보면

         그럼 일단 승리 조건을 달성한 경우와 달성하지 않은 경우로 나눠야 하나

         1. 승리한 경우
            - O 가 승리 한 경우에 O, X 수 중 X 수가 O 와 같거나 더 많은 경우
            - X 가 승리 한 경우 O 의 수가 더 많은 경우

         2. 승리 한 사람이 없을 경우
            - X 수가 더 많은 경우 ( X 는 후공이라 수가 더 많을수 없음)
            - O 수가 2개 이상 많은 경우
     */

    public int solution(String[] board) {

        int answer = -1;

        char[][] ticktacktoe = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                char c = board[i].charAt(j);
                ticktacktoe[i][j] = c;
            }
        }



        return answer;
    }

    
}
