package lv_1;

public class 나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) return i;
        }

        return answer;
    }
}
