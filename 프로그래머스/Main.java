import level0.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int num = 29183;
        int k = 1;

        int[] split = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < split.length; i++) {
            if (split[i] == k) {
                answer = i;
            }
        }


    }
}
