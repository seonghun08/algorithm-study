package array;

import java.util.Arrays;

public class ArrayEx04 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] cnt = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }

        for (int num : numArr) {
            cnt[num]++;
        }

        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < cnt.length; i++) {
            System.out.printf("%d의 개수: %d%n", i, cnt[i]);
        }
    }
}
