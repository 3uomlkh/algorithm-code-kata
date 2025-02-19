package lv_3;

import java.util.HashMap;

public class 가장_가까운_같은_글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, i);
                answer[i] = -1;
                continue;
            }

            answer[i] = i - map.get(key);
            map.put(key, i);

        }

        return answer;
    }
}
