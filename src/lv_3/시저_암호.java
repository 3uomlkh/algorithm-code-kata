package lv_3;

public class 시저_암호 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            int newC = c + n;

            if (c >= 'a' && c <= 'z') {
                newC = newC > 'z' ? (newC - 26) : newC;

            } else if (c >= 'A' && c <= 'Z') {
                newC = newC > 'Z' ? (newC - 26) : newC;
            }

            if (c == ' ') {
                answer.append(' ');
                continue;
            }

            answer.append((char) newC);
        }

        return answer.toString();
    }
}
