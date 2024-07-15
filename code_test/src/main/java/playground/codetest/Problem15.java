package playground.codetest;

import java.util.Arrays;

public class Problem15 {

    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        System.out.println(Arrays.toString(solution(arr)));
    }
    /*
    *  이게 재귀 문제 라면...
    *  1. An = 4 * A(n-1)
    *  부문제 들의 탐색 시작 좌표 (0,0) (0,2) (2,0) (2,2)
    *
    * */

    public static int[] solution(int[][] arr) {
        int[] answer = {0,0};
        System.out.println(arr.length);
       return compressQuad(0, 0, arr.length, arr, answer);
    }


    public static int[] compressQuad(int startX, int startY, int length, int[][] arr, int[] answer){


        if (length <= 1) {

            if (arr[startY][startX] == 1) {
                answer[1]++;
            } else {
                answer[0]++;
            }
            return answer;
        }

        int startPoint = arr[startY][startX];
        boolean isCompress = true;

        for (int i = startX; i < startX + length; i++) {
            for (int j = startY; j < startY + length; j++) {
                if (startPoint != arr[j][i]) {
                    isCompress = false;
                    break;
                }
            }
        }

        if (isCompress) {
            if (startPoint == 1) answer[1]++;
            else answer[0]++;
        }else {
            compressQuad(startX, startY, length / 2, arr, answer);
            compressQuad(startX + length / 2, startY, length / 2, arr, answer);
            compressQuad(startX,  startY + length / 2, length / 2, arr, answer);
            compressQuad(startX + length / 2,  startY + length /2, length / 2, arr, answer);
        }

        return answer;

    }
}
