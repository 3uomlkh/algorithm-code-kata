package lv_3;

import java.util.Arrays;

public class 과일_장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int n = score.length;
        Arrays.sort(score);

        for (int i = n-m; i >= 0; i-=m) {
            answer += score[i] * m;
        }

        return answer;
    }
}
