package lv_1;

public class x만큼_간격이_있는_n개의_숫자 {
    // int와 long의 범위에 주의하자.
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long lx = x;

        for (int i = 0; i < n; i++) {
            answer[i] = lx;
            lx += x;
        }

        return answer;
    }
}
