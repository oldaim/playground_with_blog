package playground.codetest;

public class LeetCode221 {

    public static void main(String[] args) {

        LeetCode221 leetCode221 = new LeetCode221();

        char [][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        System.out.println(leetCode221.maximalSquare(matrix));

    }

    public int maximalSquare(char[][] matrix) {
        /*
            이걸 보고 정사각형임을 어떻게 판단하지?
         */

        int height = matrix.length;
        int width = matrix[0].length;
        int max = 0;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == '1' && max <= width - j && max <= height - i) max = Math.max(max, returnSquareableNum(height, width, matrix, i , j));
            }

        }

        return max * max;
    }

    private int returnSquareableNum(int height, int width, char[][] matrix, int  i, int j) {

        int ableLength = 1;
        boolean isSquareable = true;

        while (isSquareable){

            int ableSquareHeight = i + ableLength;
            int ableSquareWidth = j + ableLength;

            if (ableSquareHeight >= height || ableSquareWidth >= width) isSquareable = false;
            else {

                for (int k = i; k <= ableSquareHeight; k++) {
                    for (int l = j; l <= ableSquareWidth; l++) {
                        if (matrix[k][l] == '0') {
                            isSquareable = false;
                            break;
                        }
                    }
                }

                if (!isSquareable) break;
                else ableLength++;
            }

        }

        return ableLength;
    }

}
