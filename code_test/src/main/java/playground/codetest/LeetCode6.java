package playground.codetest;

import java.util.Arrays;

public class LeetCode6 {

    public static void main(String[] args) {
        LeetCode6 leetCode6 = new LeetCode6();

        System.out.println(leetCode6.convert("AB", 1));
    }

    public String convert(String s, int numRows) {

        char[][] stringArrays = new char[numRows][s.length()];
        int height = 0;
        int width = 0;
        boolean isZigZag = false;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (height == 0) {
                isZigZag = false;
            }

            if (height == numRows - 1) {
                isZigZag = true;
            }


            char c = s.charAt(i);

            stringArrays[height][width] = c;

            if (isZigZag){
                width++;
                height--;
                if (height < 0) height = 0;

            } else height++;



        }

        for (int i = 0; i < numRows; i++) {

           String rowString = String.copyValueOf(stringArrays[i]).replaceAll("\u0000","").trim();
           answer.append(rowString);
        }

        return answer.toString();
    }
}
