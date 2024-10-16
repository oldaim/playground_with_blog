package playground.codetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Programmers03 {

    public static void main(String[] args) {

        /*
            2024 KAKAO WINTER INTERNSHIP 도넛 과 막대 그래프
            방향이 있는 그래프, map에 그래프를 표현
            edge[0] = start 이며 key 가 될것
            edge[1] = end 이며 value 가 될것

            일단 graph 를 만들고

            필요한 로직

            1. 막대 모양 그래프를 구해야 한다.

            2. 도넛 모양 그래프를 구해야 한다.

            3. 8자 모양 그래프를 구해야 한다.

            4. 이와 무관한 정점을 구해야한다.

            그래프 탐색은

            더이상 갈 정점이 없거나 다시 처음으로 돌아오는 경우를 산정하고

             지난 점을 List 에 저장하여 반환한다.
         */

        Programmers03 programmers03 = new Programmers03();

        int[][] edges = {
                {4, 11}, {1, 12}, {8, 3},
                {12, 7}, {4, 2}, {7, 11},
                {4, 8}, {9, 6}, {10, 11},
                {6, 10}, {3, 5}, {11, 1},
                {5, 3}, {11, 9}, {3, 8}
        };

        programmers03.solution(edges);

    }

    public int[] solution(int[][] edges) {
        int[] answer = {};

        HashMap<Integer, ArrayList<Integer>> totalGraph = new HashMap<>();

        for (int[] edge : edges) {

            int key = edge[0];
            int value = edge[1];

            if (totalGraph.containsKey(key)) {

                totalGraph.get(key).add(value);

            } else {
                totalGraph.put(key, new ArrayList<>());
                totalGraph.get(key).add(value);
            }

        }



        return answer;
    }

}
