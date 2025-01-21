package lv_2;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (char c : arr) {
            answer.append(c);
        }
        return answer.reverse().toString();
    }
}
