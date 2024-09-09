package playground.codetest;

public class LeetCode392 {

    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        /*
        *   subSequence 를 구하는 문제
        *   abc -> ahbgdc true
        *   axc -> ahbgdc false
        * */

        int sCount = 0;
        boolean[] dp = new boolean[s.length()];
        if (s.isEmpty()) return true;


        for (int i = 0; i < t.length(); i++) {

            char sChar = s.charAt(sCount);
            char tChar = t.charAt(i);

            if (sChar == tChar){
                dp[sCount] = true;
                sCount++;
            }

            if (sCount >= s.length()) break;

        }

        for (boolean b : dp) {
            if (!b) return false;
        }

        return true;
    }
}
