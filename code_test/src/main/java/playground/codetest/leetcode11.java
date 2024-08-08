package playground.codetest;

public class leetcode11 {

    public int maxArea(int[] height){

        int length = height.length;
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < height.length; j++) {
            int k = height[j];

            for (int i1 = 0; i1 < height.length; i1++) {
                int i = height[i1];

                int heightContainer = Math.min(k, i);
                int widthContainer = Math.abs(j - i1);

                max = Math.max(heightContainer * widthContainer, max);

            }

        }

        return max;
    }
}
