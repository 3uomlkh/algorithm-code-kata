package lv_3;

import java.util.HashMap;

public class 숫자_문자열과_영단어 {
    public int solution(String s) {
        int answer = 0;
        String str = s;
        StringBuilder result = new StringBuilder();
        HashMap<String, String> map = new HashMap<>(10);
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for (String key : map.keySet()) {
            if (str.contains(key)) {
                str = str.replace(key, map.get(key));
            }
        }

        return Integer.valueOf(str);
    }
}
