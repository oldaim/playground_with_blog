package playground.codetest;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class problem30 {

    /*
     * 개발 언어 항목에 cpp, java, python
     * 지원 backend, frontend
     * 경력구분 junior, senior
     * 소울푸드 chicken, pizza
     *
     * 이러한 조건중에 코딩테스트를 100점 이상 받은 사람은 몇명인가? (정렬된 조건에서 100점이상 받은)
     */

    public static void main(String[] args) {

        String[] infos = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

        solution(infos, query);
    }

    public static int[] solution(String[] info, String[] query) {

        int[] answer = {};

        ArrayList<Info> infoProblemList = new ArrayList<>();
        ArrayList<Info> infoAnsList = new ArrayList<>();
        ArrayList<Integer> ansList = new ArrayList<>();


        for (String s : info) {

            String[] infos = s.split(" ");

            infoProblemList.add(
                    new Info(
                            infos[0],
                            infos[1],
                            infos[2],
                            infos[3],
                            Integer.parseInt(infos[4])
                    )
            );

        }

        for (String s: query) {

            String[] infos = s.split(" and ");

            infoAnsList.add(
                    new Info(
                            infos[0],
                            infos[1],
                            infos[2],
                            infos[3].split(" ")[0],
                            Integer.parseInt(infos[3].split(" ")[1])
                    )
            );
        }

       infoProblemList.sort(Comparator.comparingInt(s -> s.score));

       int[] scoreStream = infoProblemList.stream().mapToInt(s -> s.score).toArray();

       int count = 0;

        for (Info value : infoAnsList) {

            int index = Arrays.binarySearch(scoreStream, 0, scoreStream.length, value.score);

            if (index < 0) index = Math.abs(index) - 1;

            for (int j = index; j < infoProblemList.size(); j++) {

                Info problem = infoProblemList.get(j);
                Info ans = value;

                if ((Objects.equals(problem.food, ans.food) || ans.food.equals("-")) &&
                        (Objects.equals(problem.language, ans.language) || ans.language.equals("-")) &&
                        (Objects.equals(problem.level, ans.level) || ans.level.equals("-")) &&
                        (Objects.equals(problem.position, ans.position) || ans.position.equals("-"))) count++;


            }

            ansList.add(count);
            count = 0;
        }


        return ansList.stream().mapToInt(Integer::intValue).toArray();
    }


    public static class Info{
        public String language;
        public String position;
        public String level;
        public String food;
        public Integer score;

        public Info(String language, String position, String level, String food, Integer score) {
            this.language = language;
            this.position = position;
            this.level = level;
            this.food = food;
            this.score = score;
        }
    }

}
