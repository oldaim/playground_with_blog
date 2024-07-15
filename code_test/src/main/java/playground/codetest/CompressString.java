package playground.codetest;

public class CompressString {

    /*
        1. 문자열을 앞자리 부터 1 씩 잘라본다
        2. 문자열의 크기만큼 잘라지는 숫자를 반복한다.
        3. 그중 제일 작은 값을 리턴한다.

     */

    public static void main(String[] args) {
        System.out.println(solution("ababcdcdababcdcd"));
    }

    public static int solution(String s) {
        /*
        * 반복되는 작은 문자열 sub
        * sub 는 최소 1부터 문자열 크기의 반까지
        * 먼저 sub를 지정하고 문자열에 반복
        * 반복 중에 sub가 문자열과 다른 경우 start, start + 압축 크기 만큼 subString 한후 sub 에 저장하고 비교
        * */
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < s.length() / 2  + 1; i++) {
            String sub = s.substring(0, i);
            int start = 0;
            int end = start + sub.length();
            int count = 0;


            StringBuilder sb = new StringBuilder();

            while (end <= s.length()){
                if (s.substring(start, end).equals(sub) && end <= s.length()) {
                    count++;
                    start = start + sub.length();
                    end = start + sub.length();
                }else {
                    if (count > 1) sb.append(count);
                    sb.append(sub);
                    count = 0;
                    sub = s.substring(start, end);
                }

            }

            System.out.println(sb);

            min = Math.min(sb.length(), min);

        }

        return min;
    }


}
