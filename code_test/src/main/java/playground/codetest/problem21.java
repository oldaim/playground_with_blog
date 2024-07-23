package playground.codetest;

import java.util.*;

public class problem21 {

    public static void main(String[] args) {
        System.out.println(solution("011"));
    }

    public static int solution(String numbers) {



        List<Character> numberList = new ArrayList<>();
        HashSet<String> usedString = new HashSet<>();

        for (int i = 0; i < numbers.length(); i++) {
            numberList.add(numbers.charAt(i));
        }

        StringBuilder isPrimeString = new StringBuilder();

        per(numberList, isPrimeString, usedString);

        System.out.println(Arrays.toString(Objects.requireNonNull(usedString).toArray()));

        return Objects.requireNonNull(usedString).size();
    }

    private static void per(List<Character> numberList, StringBuilder isPrimeString, HashSet<String> usedString) {
        if (numberList.isEmpty()) return;
        else {


            for (int i = 0; i< numberList.size(); i++){

                Character el = numberList.get(i);

                isPrimeString.append(el);

                if (isPrime(isPrimeString.toString())) usedString.add(isPrimeString.toString());

                List<Character> dummyList = new ArrayList<>(numberList);

                dummyList.remove(i);

                StringBuilder st = new StringBuilder(isPrimeString.toString());

                per(dummyList, st, usedString);

            }

        }

    }

    public static boolean isPrime(String isPrime){

        if (isPrime.charAt(0) == '0' && isPrime.length() > 1) isPrime = isPrime.substring(1);

        int num =  Integer.parseInt(isPrime);

        if (num == 0 || num == 1) return false;

        for (int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
