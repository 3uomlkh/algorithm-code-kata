package lv_2;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (price * i);
        }
        return money < sum ? (sum - money) : 0;
    }
}
