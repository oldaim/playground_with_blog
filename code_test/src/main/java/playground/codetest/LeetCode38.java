package playground.codetest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class LeetCode38 {

    public static void main(String[] args) {

        LeetCode38 leetCode38 = new LeetCode38();

        System.out.println(leetCode38.countAndSay(5));

    }

    public String countAndSay(int n) {

        String[] cas = new String[30];
        cas[0] = "1";

        for (int i = 1; i < 30; i++) {

            String beforeCas = cas[i - 1];

            HashMap<Character, Integer> map = new LinkedHashMap<>();

            for (int j = 0; j < beforeCas.length(); j++) {


                Character s = beforeCas.charAt(j);

                if (map.containsKey(s)){
                    Integer count = map.get(s);
                    count = count + 1;
                    map.put(s, count);
                }else {
                    map.put(s, 1);
                }


            }

            List<String> list = map.entrySet().stream().map((entry) -> {
                    String key = entry.getKey().toString();
                    String value = String.valueOf(entry.getValue());
                    return value + key;
                }).toList();

            String result = list.stream().reduce("", (string, string2) -> string + string2);

            cas[i] = result;

        }

        return cas[n - 1];

    }
}
