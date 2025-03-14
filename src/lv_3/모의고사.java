package lv_3;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (supo1[i%supo1.length] == answers[i]) scores[0]++;
            if (supo2[i%supo2.length] == answers[i]) scores[1]++;
            if (supo3[i%supo3.length] == answers[i]) scores[2]++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        for (int i = 0; i < scores.length; i++) {
            if (max == scores[i]) result.add(i + 1);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
