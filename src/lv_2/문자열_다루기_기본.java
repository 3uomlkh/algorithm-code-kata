package lv_2;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        return s.chars().allMatch(Character::isDigit)
                && (s.length() == 4 || s.length() == 6);
    }
}
