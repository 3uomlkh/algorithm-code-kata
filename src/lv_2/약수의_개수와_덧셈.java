package lv_2;

public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (isDivisorCountEven(i)) {
                answer += i;
            } else {
                answer -=i;
            }
        }
        return answer;
    }

    public boolean isDivisorCountEven(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count % 2 == 0 ? true : false;
    }
}
