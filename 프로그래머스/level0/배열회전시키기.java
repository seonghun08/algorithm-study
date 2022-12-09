package level0;

import java.util.ArrayList;

// 120844
public class 배열회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i-1];
            }
        } else {
            answer[numbers.length-1] = numbers[0];
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
        }
        return answer;
    }

    public ArrayList solution2(int[] numbers, String direction) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            answer.add(numbers[i]);
        }
        if (direction.equals("right")) {
            answer.add(0, numbers[numbers.length - 1]);
            answer.remove(answer.size() - 1);
        } else {
            answer.add(numbers[0]);
            answer.remove(0);
        }
        return answer;
    }
}
