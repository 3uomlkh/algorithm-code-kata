package lv_3;

import java.util.ArrayList;
import java.util.List;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            int a = commands[i][0] - 1;
            int b = commands[i][1];
            int c = commands[i][2] - 1;

            for (int j = a; j < b; j++) {
                list.add(array[j]);
            }

            list.sort(null);
            answer[i] = list.get(c);
        }

        return answer;
    }
}
