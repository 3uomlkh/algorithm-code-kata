package lv_3;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int temp = 0;
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
        }

        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][0] > maxWidth) {
                maxWidth = sizes[i][0];
            }
            if (sizes[i][1] > maxHeight) {
                maxHeight = sizes[i][1];
            }
        }

        return maxWidth * maxHeight;
    }
}
