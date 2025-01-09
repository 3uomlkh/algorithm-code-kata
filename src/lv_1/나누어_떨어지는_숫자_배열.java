package lv_1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) list.add(n);
        }

        if (list.isEmpty()) return new int[] {-1};

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    /* list 정렬하기
     * 1) Collections.sort(list) / Collections.sort(list, Collections.reverseOrder())
     * 2) 스트림 API
     *    - List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
     *    - List<Integer> reverseSortedList = list.stream()
                                              .sorted(Comparator.reverseOrder())
                                              .collect(Collectors.toList());
     * 3) 객체 정렬 시 Comparator 사용
     * 4) Arrays.sort()로 기본 배열 정렬(내림차순은 Integer 배열 필요)
     */
}
