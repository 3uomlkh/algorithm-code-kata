package lv_1;

public class 자연수_뒤집어_배열로_만들기 {
    // int와 long의 범위에 주의하자.
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        int i = 0;

        while(n != 0) {
            answer[i++] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}
