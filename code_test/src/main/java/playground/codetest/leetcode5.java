package playground.codetest;

public class leetcode5 {


    public static void main(String[] args) {
        leetcode5 leetcode5 = new leetcode5();
        String s = "abb";
        System.out.println(leetcode5.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        // 최댓값?

        int start = 0;
        int end = s.length() - 1;
        String maxString = "";

        while(start < s.length()){
            if (end < start){
                start += 1;
                end = s.length() - 1;
            }

            if (start == s.length()) break;

            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if(startChar == endChar && maxString.length() <= (end - start)) {
                if(isPalindromic(s.substring(start, end + 1))) {
                    maxString = s.substring(start, end + 1);
                    start += 1;
                    end = s.length() - 1;
                    continue;
                }
            }

            end -=1;
        }

        return maxString;
    }


    public boolean isPalindromic(String subString){
        int start = 0;
        int end = subString.length() - 1;

        while(start <= end){
            if(subString.charAt(start) != subString.charAt(end)) return false;
            start += 1;
            end -= 1;
        }

        return true;
    }
}

