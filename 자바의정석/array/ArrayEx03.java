package array;

import java.util.*;

/**
 * 버블정렬 알고리즘 복습
 */
public class ArrayEx03 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10); // 0 ~ 9 난수
        }

        for (int i = 0; i < numArr.length - 1; i++) {
            for (int t = 0; t < numArr.length - 1 - i; t++) {
                if (numArr[t] > numArr[t + 1]) {
                    int tmp = numArr[t];
                    numArr[t] = numArr[t + 1];
                    numArr[t + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(numArr));
    }
}
