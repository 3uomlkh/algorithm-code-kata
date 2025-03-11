package lv_3;

import java.util.ArrayDeque;
import java.util.List;

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> q1 = new ArrayDeque<>(List.of(cards1)); // 큐에 배열 바로 넣을 수 X, 리스트로 변환 후 넣기
        ArrayDeque<String> q2 = new ArrayDeque<>(List.of(cards2));

        for (String s : goal) {

            if (!q1.isEmpty() && q1.peek().equals(s)) {
                q1.poll();
                continue;
            }

            if (!q2.isEmpty() && q2.peek().equals(s)) {
                q2.pop();
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}
