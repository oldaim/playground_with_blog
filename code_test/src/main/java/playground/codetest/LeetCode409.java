package playground.codetest;

import java.util.*;

public class LeetCode409 {

    public static void main(String[] args) {

        LeetCode409 leetCode409 = new LeetCode409();

        Integer answer = leetCode409.longestPalindrome("ccc");

        System.out.println(answer);
    }

    public int longestPalindrome(String s) {
        /*
            주어진 String s 에서 가장 긴 'palindrome' 문자를 반환하는 문제

            abccccdd -> dccaccd

            짝수 갯수라면 전부다 쓰일수 있고,
            홀수 라면 >1 상황에서 1개만 쓰일수 있고,
            ==1 상황에서는 모든 문자중에 1개만 사용가능 하다.

         */
        Comparator<int[]> comparator = (o1, o2) -> o2[1] - o1[1];
        Map<Character, Integer> characterMap = new LinkedHashMap<>();
        int count = 0;
        boolean isOneUsed = false;

        for (int i = 0; i < s.length(); i++) {

            Character c = s.charAt(i);

            if (characterMap.containsKey(c)){
                Integer integer = characterMap.get(c);
                integer = integer + 1;
                characterMap.put(c, integer);
            }else {
                characterMap.put(c, 1);
            }

        }

        List<Integer> values = new ArrayList<>(characterMap.values().stream().toList());

        int findOddMax = 0;

        for (Integer alphabetCount : values) {

            if (alphabetCount % 2 == 1){
                findOddMax = Math.max(findOddMax, alphabetCount);
            }

        }

        if (findOddMax != 0 ) count++;

        for (Integer alphabetCount : values) {

            if (alphabetCount % 2 == 0) count += alphabetCount;
            else count += (alphabetCount - 1);

        }

        return count;
    }

}
