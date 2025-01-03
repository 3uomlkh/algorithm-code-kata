package lv_1;

public class 정수_제곱근_판별 {
    public long solution(long n) {
        long i = 0;
        while (i * i <= n) {
            if (++i * i == n) return (i+1) * (i+1);
        }
        return -1;
    }
}
