package lv_3;

public class 소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int n) {
        for (int i = 3; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
