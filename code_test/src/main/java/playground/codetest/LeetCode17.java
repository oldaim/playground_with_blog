package playground.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode17 {

    public static void main(String[] args) {

        LeetCode17 leetCode17 = new LeetCode17();

        String digits = "23";

        System.out.println(leetCode17.letterCombinations(digits));
    }

    public List<String> letterCombinations(String digits) {

        HashMap<String, List<String>> phoneNumberMap = new HashMap<>();

        phoneNumberMap.put("2", List.of("a","b","c"));
        phoneNumberMap.put("3", List.of("d","e","f"));
        phoneNumberMap.put("4", List.of("g","h","i"));
        phoneNumberMap.put("5", List.of("j","k","l"));
        phoneNumberMap.put("6", List.of("m","n","o"));
        phoneNumberMap.put("7", List.of("p","q","r","s"));
        phoneNumberMap.put("8", List.of("t","u","v"));
        phoneNumberMap.put("9", List.of("w","x","y","z"));

        List<String> answerList = new ArrayList<>();



        makeLetterCombination(digits, 0, phoneNumberMap, "", answerList);

        return answerList;
    }

    public void makeLetterCombination(String digits, int digitCount, HashMap<String, List<String>> map, String sb, List<String> answerList){

        if (digits.length() - 1 >= digitCount) {
            String phoneNumber = String.valueOf(digits.charAt(digitCount));

            List<String> phoneNumWordList = map.get(phoneNumber);

            for (String string : phoneNumWordList) {

                digitCount = digitCount + 1;

                makeLetterCombination(digits, digitCount, map, sb + string, answerList);

                digitCount = digitCount - 1;
            }
        }else {

            answerList.add(sb);

        }
    }


}
