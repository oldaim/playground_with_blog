package playground.codetest;

import java.util.Arrays;

public class Caesar {

    public static void main(String[] args) {
        System.out.print(solution("a B z", 4));
    }

    public static String solution(String s, int n) {

        char[] charArray =  s.toCharArray();
        char[] answerArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {

            if (Character.isLowerCase(charArray[i])){
                if ((charArray[i] + n) > 'z') answerArray[i] = (char) (charArray[i] + n - 26);
                else answerArray[i] = (char) (charArray[i] + n);
            }else if(Character.isUpperCase(charArray[i])){
                if ((charArray[i] + n) > 'Z') answerArray[i] = (char) (charArray[i] + n - 26);
                else answerArray[i] = (char) (charArray[i] + n);
            }else {
                answerArray[i] = charArray[i];
            }

        }

        return String.copyValueOf(answerArray);
    }
}
