package level0;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int min = 101;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i] - n;
            num = num > 0 ? num : -num;
            if (min > num) {
                min = num;
                index = i;
            } else if (min == num && array[index] > array[i]) {
                min = num;
                index = i;
            }
        }
        return array[index];
    }
}
