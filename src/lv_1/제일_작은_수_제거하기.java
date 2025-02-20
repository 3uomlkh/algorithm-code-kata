package lv_1;

public class 제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min != arr[i]) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}
