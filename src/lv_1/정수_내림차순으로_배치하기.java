package lv_1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
    public static long solution(long n) {
        int length = String.valueOf(n).length();
        int[] intArr = new int[length];

        int a = 0;
        int idx = 0;
        while (n != 0) {
            a = (int) (n % 10);
            intArr[idx++] = a;
            n /= 10;
        }
        Arrays.sort(intArr);

        String str = "";
        for (int i = intArr.length - 1; i >= 0; i--) {
            str += intArr[i];
        }

        return Long.parseLong(str);
    }
}
