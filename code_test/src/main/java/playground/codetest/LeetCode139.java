package playground.codetest;

import java.util.*;

public class LeetCode139 {


    public static void main(String[] args) {

        LeetCode139 leetCode139 = new LeetCode139();

        String s = "aaaaaaa";

        List<String> wordBreak = Arrays.asList("aaaa","aaa");

        System.out.println(leetCode139.wordBreak(s, wordBreak));

    }

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> wordDictSet = new HashSet<>(wordDict);
        List<String> answerSet = new ArrayList<>();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {

            sb.append(s.charAt(i));

            String testString = sb.toString();

            if (wordDictSet.contains(testString)){
                answerSet.add(testString);
                sb = new StringBuilder();
            }


        }

        if (answerSet.isEmpty()) return false;

        String answer = String.join("",answerSet);

        return Objects.equals(answer, s);
    }
}
