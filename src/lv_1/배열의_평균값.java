package lv_1;

import java.util.Arrays;

public class 배열의_평균값 {
    public double solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return (double) sum / numbers.length;
    }
}
