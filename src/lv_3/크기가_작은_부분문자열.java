package lv_3;

public class 크기가_작은_부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        int end = p.length();

        while(end <= t.length()) {
            String partStr = t.substring(start, end);
            if (partStr.compareTo(p) <= 0) { // int로 비교하니 런타임 에러, 문자열로 비교하기!
                answer++;
            }
            start++;
            end++;
        }

        return answer;
    }
}
