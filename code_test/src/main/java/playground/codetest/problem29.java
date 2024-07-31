package playground.codetest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class problem29 {

    /*
     * 코스요리 메뉴는 최소 2가지 이상의 단품 메뉴로 구성
     * 최소 두명에 의해 시킨 단품 메뉴여야 한다.
     */

    public static void main(String[] args) {

        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,5};
        solution(orders,course);
    }

    public static String[] solution(String[] orders, int[] course) {

        String[] answer = {};
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> ans = new HashSet<>();

        for (int wordLength : course) {

            for (String order : orders) {
                combination(order, new boolean[order.length()], "", wordLength, map);
            }

            Optional<Integer> maxOp = map.values().stream().max(Integer::compareTo);
            int max;

            if (maxOp.isPresent())  max = maxOp.get();
            else {
                max = 0;
            }


            map.entrySet().forEach(
                    stringIntegerEntry -> {
                        if(stringIntegerEntry.getValue() == max && max > 1) ans.add(stringIntegerEntry.getKey());
                    }
            );

            map = new HashMap<>();
        }

        System.out.println(ans);

        return answer;
    }

    public static void combination(String order, boolean[] isUsed, String comb,  int course, HashMap<String, Integer> hashMap){
        if (comb.length() >= course){

           char[] ca = comb.toCharArray();

           Arrays.sort(ca);

           comb = new String(ca);

            if (hashMap.containsKey(comb)) {
                 Integer i = hashMap.get(comb) + 1;
                 hashMap.put(comb, i);
            }else {
                hashMap.put(comb, 1);
            }
        }else {

            for (int i = 0; i < order.length(); i++) {
                if(!isUsed[i]) {

                    isUsed[i] = true;

                    combination(order, isUsed, comb + order.charAt(i), course, hashMap);

                    isUsed[i] = false;
                }


            }

        }
    }
}
