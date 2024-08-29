package playground.codetest;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {

    /*
    *  가장 큰 부분 문자열의 길이를 구하는 문제 (부분문자열 고를 필요없음)
    *  beforeStartIndex 와 beforeIndex, endIndex 로 구성
    * */

    public static void main(String[] args) {

        LeetCode3 leetCode3 = new LeetCode3();

        int answer = leetCode3.lengthOfLongestSubstring("abcabcbb");

        System.out.println("answer is :" + answer);
    }

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty() || s.length() == 1) return s.length();
        else {

            int length = s.length();
            int beforeStartIndex = 0;
            int beforeIndex = 0;
            int endIndex = 1;
            int maxSubStringLength = 0;
            Set<Character> characters = new HashSet<>();

            while (endIndex < length){

                char beforeIndexChar = s.charAt(beforeIndex);
                char endIndexChar = s.charAt(endIndex);

                if (beforeIndexChar != endIndexChar && !characters.contains(endIndexChar)){

                    beforeIndex++;
                    endIndex++;
                    characters.add(beforeIndexChar);

                    int subLength = beforeIndex - beforeStartIndex + 1;
                    maxSubStringLength = Math.max(maxSubStringLength, subLength);

                }else {

                    int subLength = beforeIndex - beforeStartIndex + 1;
                    maxSubStringLength = Math.max(maxSubStringLength, subLength);


                    beforeStartIndex++;
                    beforeIndex = beforeStartIndex;
                    endIndex = beforeIndex + 1;

                    characters.clear();
                }

            }

            return maxSubStringLength;
        }

    }
}
