package lv_1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = "";
        int index = s.length() / 2;
        if (s.length() % 2 != 0) {
            answer = s.substring(index, index + 1);
        } else {
            answer = s.substring(index - 1, index + 1);
        }

        return answer;
    }
}
