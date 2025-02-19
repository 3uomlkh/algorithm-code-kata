package lv_3;

import java.util.Set;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {

        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[result.size()];
        int index = 0;
        for (int i : result) {
            answer[index++] = i;
        }

        return answer;
    }
}
