package level0;

// 120899
public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }
        int[] answer = {max, max_index};
        return answer;
    }
}
