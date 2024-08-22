package playground.codetest;

import java.util.StringTokenizer;

public class LeetCode165 {

    /*
    * 주어진 version1 과 version2 를 비교하여 version2 가 크면 -1, version1 이 크면 1, 같으면 0
    * 1.2 와 1.10 을 비교하면 2 < 10 이므로 version2
    * */

    public static void main(String[] args) {
        LeetCode165 leetCode165 = new LeetCode165();

        String version1 = "1.01";
        String version2 = "1.001";

        System.out.println(leetCode165.compareVersion(version1, version2));
    }

    public int compareVersion(String version1, String version2) {

        StringTokenizer stVersion1 = new StringTokenizer(version1, ".");
        StringTokenizer stVersion2 = new StringTokenizer(version2, ".");



        while (stVersion1.hasMoreTokens() && stVersion2.hasMoreTokens()){

            int stringVersion1 = Integer.parseInt(stVersion1.nextToken());
            int stringVersion2 = Integer.parseInt(stVersion2.nextToken());

            if (stringVersion1 > stringVersion2) return 1;
            else if(stringVersion1 < stringVersion2) return -1;

        }

        if (stVersion1.hasMoreTokens()){
            while (stVersion1.hasMoreTokens()){
                int stringVersionElse2 = Integer.parseInt(stVersion1.nextToken());
                if (stringVersionElse2 > 0) return 1;
            }
        }

        if (stVersion2.hasMoreTokens()){
            while (stVersion2.hasMoreTokens()){
                int stringVersionElse2 = Integer.parseInt(stVersion2.nextToken());
                if (stringVersionElse2 > 0) return -1;
            }
        }

        return 0;
    }

}
