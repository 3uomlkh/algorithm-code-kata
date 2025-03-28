package lv_3;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;

        for (int i : section) {
            if (start + m > i) continue;
            start = i;
            answer++;
        }

        return answer;
    }
}
