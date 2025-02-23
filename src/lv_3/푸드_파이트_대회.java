package lv_3;

public class 푸드_파이트_대회 {
    public String solution(int[] food) {
        String answer = "";
        int[] foodPortionPerPerson = new int[food.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            foodPortionPerPerson[i] = food[i] / 2;
        }

        for (int i = 1; i < foodPortionPerPerson.length; i++) {
            for (int j = 0; j < foodPortionPerPerson[i]; j++) {
                sb.append(i);
            }
        }

        answer += sb;
        sb.append(0).reverse();
        answer += sb;

        return answer;
    }

    public String gptSolution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String half = sb.toString();
        return half + "0" + sb.reverse();
    }
}
