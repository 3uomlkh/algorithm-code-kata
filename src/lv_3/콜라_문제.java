package lv_3;

public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int receivedColaCount;
        int martDeliveredColaCount;

        while (n >= a) {
            receivedColaCount = (n / a) * b;
            martDeliveredColaCount = a * (n / a);
            n = n - martDeliveredColaCount + receivedColaCount;
            answer += receivedColaCount;
        }

        return answer;
    }

    public int solution2(int a, int b, int n) {
        return (n > b ? n - b : 0) / (a - b) * b;
    }
}
