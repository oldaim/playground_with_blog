package playground.codetest;

public class Problem9 {

    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n) {

        String num = Integer.toString(n,3);

        System.out.println(num);

        StringBuilder sb = new StringBuilder(num);

        String reverseNum = sb.reverse().toString();

        System.out.println(reverseNum);

        return Integer.parseInt(reverseNum, 3);
    }
}
