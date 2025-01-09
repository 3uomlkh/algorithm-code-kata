package lv_1;

public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) absolutes[i] *= -1;
        }

        for (int i : absolutes) {
            answer += i;
        }

        return answer;
    }

    // 정답 풀이 중 더 간결한 것 - 삼항 연산자 이용해 바로 계산
    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
