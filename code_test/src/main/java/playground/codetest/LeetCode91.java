package playground.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode91 {

    public static void main(String[] args) {
        LeetCode91 leetCode91 = new LeetCode91();

        System.out.println(leetCode91.numDecodings("11106"));
    }

    public int numDecodings(String s) {
        /*
            재귀를 사용해서 길이 1 혹은 2의 문자열의 조합을 계산하는 문제
         */

        List<String> answerList = new ArrayList<>();
        answerList.add(s);
        int answer = 0;


        while (!answerList.isEmpty()){

            ArrayList<String> newAns = new ArrayList<>();

            for (String ans : answerList) {



                if (ans.length() >= 2) {

                    String case1 = ans.substring(0, 1);
                    String case2 = ans.substring(0, 2);

                    if (!case1.startsWith("0") && Integer.parseInt(case1) >= 1 && Integer.parseInt(case1) <= 26) {
                        newAns.add(ans.substring(1));
                    }

                    if (!case2.startsWith("0") && Integer.parseInt(case2) >= 1 && Integer.parseInt(case2) <= 26) {
                        newAns.add(ans.substring(2));
                    }

                }else if(ans.length() == 1){
                     String case1 = ans.substring(0, 1);

                     if (!case1.startsWith("0") && Integer.parseInt(case1) >= 1 && Integer.parseInt(case1) <= 26) {
                        newAns.add(ans.substring(1));
                    }
                }

            }

            answer = newAns.size();

            answerList = newAns;

        }

        return answer;

    }


}
