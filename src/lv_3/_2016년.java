package lv_3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class _2016년 {
    public String solution(int a, int b) {

        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String[] days = {"SUN", "MON", "TUE", "WED", "THU","FRI", "SAT"};

        return days[dayOfWeek.getValue() % 7];
    }
}
